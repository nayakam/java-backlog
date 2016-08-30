package com.nayakam.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Static Code Analysis </b>
 * <P>
 * Code review - please review the following code and talk us through any issues you find.
 * <pre>
 * {@code
 *
 * public class TamilTranslator {
 *      final Map<String, String> map;
 *
 *      public TamilTranslator() {
 *
 *      }
 *
 *      public TamilTranslator(Map<String, String> map) {
 *              this.map = map;
 *      }
 *
 *      public String translate(String inputPhrase) {
 *          String phrase = "";
 *
 *          String[] split = inputPhrase.split(" ");
 *
 *          for (int i = 1; i < split.length; i++) {
 *                  String word = map.get(split[i]);
 *
 *                  if (word == "EOF") {
 *                      break;
 *                  } else if (word == null) {
 *                      throw new RuntimeException();
 *                  }
 *
 *                  phrase += word + " ";
 *          }
 *
 *          return phrase;
 *      }
 * }
 * } </pre>
 * <p>
 * How could you improve the quality of this code?
 * <p>
 * What if we wanted to write a Chinese Translator, how would this affect your design?
 */
public class TamilTranslator {
    public static final String EMPTY_STRING = " ";
    final Map<String, String> map;

    public TamilTranslator() {
        map = new HashMap<String, String>();

    }

    public TamilTranslator(Map<String, String> map) {
        this.map = map;
    }

    public String translate(String inputPhrase) throws Exception {
        StringBuilder phraseSB = new StringBuilder();

        String[] split = inputPhrase.split(EMPTY_STRING);

        for (int i = 0; i < split.length; i++) {
            String word = map.get(split[i]);

            if (word == null) {
                throw new Exception("Could not translate word :" + word);
            }

            phraseSB.append(word).append(EMPTY_STRING);
        }

        return phraseSB.toString();
    }
}