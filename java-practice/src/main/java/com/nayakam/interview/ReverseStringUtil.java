package com.nayakam.interview;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Write a function to reverse a string.
 */
public class ReverseStringUtil {

    public static String reverseStringUsingStringBuilder(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        return sb.append(input).reverse().toString();
    }

    public static String reverseStringUsingArray(String s) {
        char[] chars = s.toCharArray();
        char temp;
        for (int i = 0; i < chars.length / 2; i++) {
            temp = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }

    public static String reverseString1(String input) {
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }
        return reverseString;
    }

    public static String reverseStringUsingQueue(String input) {
        Deque<Character> characterQueue = new ArrayDeque<>(input.length());

        for (char c : input.toCharArray()) {
            characterQueue.addLast(c);
        }
        String reverseString = "";
        while (!characterQueue.isEmpty()) {
            reverseString += characterQueue.pollLast();
        }
        return reverseString;
    }

    public static String reverseStringRecursive(String input) {
        if (input.length() <= 1) {
            return input;
        }
        return reverseStringRecursive(input.substring(1, input.length())) + input.charAt(0);
    }

    public static String reverseStringUsingBitwiseXOR(String s) {
        byte[] array = s.getBytes();
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            //System.out.println("array[i]:" + array[i] + ", array[j]:" + array[j]);
            //System.out.println("array[i]:" + new String(new byte[] { array[i] }) + ", array[j]:" + new String(new byte[] { array[j] }));
            array[i] ^= array[j];
            //System.out.println("array[i]:" + array[i] + ":" + new String(new byte[] { array[i] }) + ":");
            array[j] ^= array[i];
            System.out.println(String.format("%02d", j) + "th poistion value-array[j]:" + array[j] + ":" + new String(new byte[] { array[j] }) + ":");
            array[i] ^= array[j];
            System.out.println(String.format("%02d", i) + "th poistion value-array[i]:" + array[i] + ":" + new String(new byte[] { array[i] }) + ":");
        }
        return new String(array);
    }
}