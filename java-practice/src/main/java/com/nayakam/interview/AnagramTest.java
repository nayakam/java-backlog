package com.nayakam.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Anagrams Two words are said to be anagrams of each other if they contain the same characters in
 * different order
 *
 * e.g. "silent" and "listen" are anagrams "potato" and "tomato" are not anagrams, but they are
 * delicious
 *
 * Given two string arguments, determine if they are an anagram and return the result
 *
 * Focus on producing an efficient, elegant solution using relevant data structures where necessary
 *
 * Unit tests will be run on the output, simply return a boolean from the provided method.
 *
 * If the hidden example cases are failing, consider all edge cases and re-read the question. We hide
 * the tests to gauge your analytical thinking and requirements gathering skills.
 *
 * For the sake of this exercise we can assume all inputs will be given in lower case.
 *
 * Sample Input(Plaintext Link) listen silent Sample Output(Plaintext Link) true Time Limit: 5.0
 * sec(s) for each input file
 */
public class AnagramTest {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /** Read the source word */
        String sourceWord = br.readLine();
        /** Read the target word */
        String targetWord = br.readLine();
        boolean isAnagram = false;
        if (sourceWord == null || targetWord == null) {
            throw new Exception("Please check the provided words. Cann't compare provide words");
        } else if (sourceWord.length() == targetWord.length() && !sourceWord.equalsIgnoreCase(targetWord)) {
            isAnagram = sort(sourceWord).equalsIgnoreCase(sort(targetWord));
        }
        System.out.println(isAnagram);
    }

    public static String sort(String word) {
        /* Convert it as char array  */
        char[] array = word.toLowerCase().toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}