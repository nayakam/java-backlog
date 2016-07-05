package com.nayakam.practice;

import java.io.*;
import java.util.*;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        Properties p = System.getProperties();
        System.out.println("Properties stringPropertyNames :" + p.stringPropertyNames());
        System.out.println("Hello World!");
        System.out.printf("Right now it is %tr on " + "%<tA, %<tB %<te, %<tY.%n", Calendar.getInstance());
        Calendar cal = Calendar.getInstance();
        System.out.printf("Right now it is %tr on " + "%tA, %tB %<te, %<tY.%n", cal, cal, cal);
        // System.out.printf("Right now it is %tr on " + "%tA, %tB %<te, %<tY.%n", Calendar.getInstance());

        System.out.printf("#%d#,#%<6d#,#%<-6d#,#%<06d#\n", 15);
        System.out.printf("#%1$(7d#\n", -15);
        System.out.printf("#%0,7d#\n", 15);
        System.out.printf("#%+-7d#,#%+-7d#\n", 15, -15);
        System.out.printf("#%f#,#%<4.6f#,#%<+-2f#,#%<3.1f#\n", 15.25f);
        System.out.printf("#%s#,#%<6s#,#%<-6s#,#%<6s#\n", "STR");

        System.out.printf("%-12s%-12s%s\n", "Column 1", "Column 2", "Column3");
        System.out.printf("%-12d%-12d%07d\n", 15, 12, 5);

        System.out.printf("%-12s%-12s%s\n", "Column 1", "Column 2", "Column3");
        System.out.printf("%-12.5s%s", "Hello World", "World");

        int i = Integer.parseInt("5");
        Integer I = Integer.valueOf(5);
        i = I.intValue();
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toBinaryString(i));
        // pass vmargs -ea or -enableassertions -ea:com.nayakam.practice
        assert (1 < 5) : "Assert Message goes here";
        Integer param = 1;
        assert param != null : "Param cannot be null";
        System.out.println("assert");
        Set hashSet = new HashSet();
        hashSet.add(null);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        System.out.println("list:" + list);
        Collections.sort(list);
        System.out.println("Sorted list:" + list);
        System.out.println("binarySearch - -5:" + Collections.binarySearch(list, -5));
        System.out.println("binarySearch - 0:" + Collections.binarySearch(list, 0));
        System.out.println("binarySearch - 2:" + Collections.binarySearch(list, 2));
        System.out.println("binarySearch - 3:" + Collections.binarySearch(list, 3));
        System.out.println("binarySearch - 5:" + Collections.binarySearch(list, 5));
        System.out.println("binarySearch - 6:" + Collections.binarySearch(list, 6));
        System.out.println("binarySearch - 10:" + Collections.binarySearch(list, 10));

        Arrays.asList(list.toArray());

        Map hashmap = new HashMap();
        System.out.println("hasmap get:" + hashmap.get(null));
        System.out.println("hashmap put(null,test):" + hashmap.put(null, "test"));
        System.out.println("hasmap get:" + hashmap.get(null));
        System.out.println("hasmap put(null,null):" + hashmap.put(null, null));
        System.out.println("hasmap put(null,null):" + hashmap.put(null, null));
        System.out.println("hasmap get:" + hashmap.get(null));

        Map hashtable = new Hashtable();
        System.out.println("hashtable get:" + hashmap.get(null));
        //java.lang.NullPointerException
        //hashtable.put(null, "test");

        ArrayList alist = new ArrayList<Integer>();
        alist.add(4);
        alist.add(5);
        alist.add("5");
        alist.add("A");
        for (Object t : alist)
        {
            System.out.println(t.equals(5) + ", t:" + t + " , " + alist.getClass());
            //Integer a = Integer.valueOf(t.toString());
            //Integer b = (Integer) t;

        }

        Vector<String> e = new Vector<String>();
        Vector<Integer> ei = new Vector<Integer>();
        Vector<Object> o = new Vector<Object>();
        // o.add(1);
        System.out.println(e.getClass() + ", " + ei.getClass() + ", " + (e.getClass() == ei.getClass()) + "," + e.equals(o));

        File f =   new File("");
        f.delete();
        System.out.println( " file : " + f.getName());
        try
        {
            Writer w = new BufferedWriter(new FileWriter("File.TXT"));
           // f.createNewFile();

        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }


    }

    public void main(String arg)
    {
        Locale.getAvailableLocales();

    }
}
