package com.nayakam.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String s = in.next();
            int count = 0;
            if (s.length() % 2 != 0) {
                System.out.println(-1);
                continue;
            } else {
                char[] s_letter = s.toCharArray();
                char[] a = Arrays.copyOfRange(s_letter, 0, s_letter.length / 2);
                char[] b = Arrays.copyOfRange(s_letter, s_letter.length / 2, s_letter.length);
                int[] letters = new int[26];
                for (char c : b) {
                    int tmp = c - 'a';
                    letters[tmp]++;
                }

                for (char c : a) {
                    int tmp = c - 'a';
                    if (letters[tmp] > 0) {
                        letters[tmp]--;
                    }
                }

                for (int c : letters) {
                    count = count + Math.abs(c);
                }
            }
            System.out.println(count);
        }

    }
}