package com.nayakam.mail;


import com.nayakam.mail.checkworks.ChecklistType;
import com.nayakam.mail.checkworks.ObjectFactory;
import com.nayakam.mail.checkworks.SectionType;

import javax.mail.*;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchTerm;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * This program demonstrates how to search for e-mail messages which satisfy
 * a search criterion.
 */
public class EmailSearcher {

    /**
     * Searches for e-mail messages containing the specified keyword in
     * Subject field.
     *
     * @param host
     * @param port
     * @param userName
     * @param password
     * @param keyword
     */
    public void searchEmail(String host, String port, String userName,
                            String password, final String keyword) {
        Properties properties = new Properties();

        // server setting
        properties.put("mail.imap.host", host);
        properties.put("mail.imap.port", port);

        // SSL setting
        properties.setProperty("mail.imap.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.imap.socketFactory.fallback", "false");
        properties.setProperty("mail.imap.socketFactory.port",
                String.valueOf(port));

        Session session = Session.getDefaultInstance(properties);

        try {
            // connects to the message store
            Store store = session.getStore("imap");
            store.connect(userName, password);

            // opens the inbox folder
            System.out.println("store.getDefaultFolder().getFullName():" + store.getDefaultFolder().getFullName());
            Folder folderInbox = store.getFolder("INBOX");
            folderInbox.open(Folder.READ_WRITE);
            // retrieve the messages from the folder in an array and print it
            Message[] messages = folderInbox.getMessages();

            System.out.println("Email Measseage Count : " + messages.length);
            System.out.println("Email Unread Measseage Count : " + folderInbox.getUnreadMessageCount());
            System.out.println("Email New Measseage Count : " + folderInbox.getNewMessageCount());

            // creates a search criterion
            SearchTerm searchCondition = new SearchTerm() {
                @Override
                public boolean match(Message message) {
                    try {
                        if (message != null && message.getSubject() != null && message.getSubject().contains(keyword)) {
                            return true;
                        }
                    } catch (MessagingException ex) {
                        ex.printStackTrace();
                    }
                    return false;
                }
            };

            // Fetch unseen messages from inbox folder
            Message[] unReadmessages = folderInbox.search(
                    new FlagTerm(new Flags(Flags.Flag.SEEN), false));
            // performs search through the folder
            Message[] foundMessages = folderInbox.search(searchCondition, unReadmessages);
            System.out.println("Unread Email match found for serach term: " + keyword + ": " + foundMessages.length);
            for (int i = 0; i < foundMessages.length; i++) {
                Message message = foundMessages[i];
                String subject = message.getSubject();
                // message.setFlag(Flags.Flag.SEEN, true);
                System.out.println("Found message #" + i + ": " + subject);

                try {
                    Multipart mp = (Multipart) message.getContent();
                    for (int j = 0, n = mp.getCount(); j < n; j++) {
                        Part part = mp.getBodyPart(j);
                        String disposition = part.getDisposition();

                        if (Part.ATTACHMENT.toString().equalsIgnoreCase(disposition) || Part.INLINE.toString().equalsIgnoreCase(disposition)) {
                            // saveFile(part.getFileName(), part.getInputStream());
                            System.out.println("part.getFileName():" + part.getFileName());
                            System.out.println("part.getContentType():" + part.getContentType());
                            System.out.println("part.getDescription():" + part.getDescription());
                            System.out.println("part.getLineCount():" + part.getLineCount());
                            System.out.println("part.getSize():" + part.getSize());
                            String result = new BufferedReader(new InputStreamReader(part.getInputStream()))
                                    .lines().collect(Collectors.joining("\n"));
                            System.out.println(result);
                            try {
//                                JAXBContext context = JAXBContext.newInstance(ChecklistType.class);
//                                Unmarshaller unMarshaller = context.createUnmarshaller();
//                                ChecklistType checklist = (ChecklistType) unMarshaller.unmarshal(part.getInputStream());

                                JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
                                // ((JAXBElement<ChecklistType>) jaxbContext.createUnmarshaller().unmarshal( inputStream)).getValue();
                                ChecklistType checklist = ((JAXBElement<ChecklistType>) jaxbContext.createUnmarshaller().unmarshal(part.getInputStream())).getValue();


                                System.out.println(checklist);
                                System.out.println(checklist.getId());
                                System.out.println(checklist.getVersion());
                                System.out.println(checklist.getTitle());
                                System.out.println(checklist.getResponseEmail());


                                for (SectionType section : checklist.getSections().getSection()) {
                                    System.out.println(section.getSequence());
                                    System.out.println(section.getId());
                                    System.out.println(section.getTitle());
                                    System.out.println(section.getQuestions());
                                    System.out.println(section.getExplanatoryText());
                                }

                            } catch (JAXBException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    message.setFlag(Flags.Flag.SEEN, false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // disconnect
            folderInbox.close(false);
            store.close();
        } catch (NoSuchProviderException ex) {
            System.out.println("No provider.");
            ex.printStackTrace();
        } catch (MessagingException ex) {
            System.out.println("Could not connect to the message store.");
            ex.printStackTrace();
        }
    }

    /**
     * Test this program with a Gmail's account
     */
    public static void main(String[] args) {
        String host = "imap.gmail.com";
        String port = "993";
        String userName = "tsaba@itree.com.au";
        String password = "icltodlifpuwdckf";
        EmailSearcher searcher = new EmailSearcher();
        String keyword = "MPI Non-Commercial Activity Log Checklist";
        searcher.searchEmail(host, port, userName, password, keyword);
    }
}