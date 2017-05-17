package com.nayakam.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Find the pairs
 Given an array of integers, find the number of unique pairs that have a given difference

 Focus on producing an efficient, elegant solution using relevant data structures where necessary

 e.g. array: 1, 4, 5, 7, 8, 9 difference: 3

 Pairs: { (1, 4), (4, 7), (5, 8) } return: 3

 Unit tests will be run on the output, simply return an integer from the provided method identifying the number of unique pairs for the given array.

 Input for the function is supplied in the format: each number on it's own line (see Sample Input).

 If the hidden example cases are failing, consider all edge cases and re-read the question. We hide the tests to gauge your analytical thinking and requirements gathering skills.

 Sample Input(Plaintext Link)
 6
 1
 4
 5
 7
 8
 9
 3
 Sample Output(Plaintext Link)
 3
 */
/*
*  1. Read the values and insert in hash set
*  2. Loop throug the hash set and Check whether hasset contains key+ diff
*  3. Count the pair in hashset
*  Not sure what is the diff value and how to pass to program, Is it hard coded 8 values and diff 3 ?????
*  Guessing 1 value is lenght of array and last value is differnence
*/
class CountPairTest {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Set<Integer> inputs = new LinkedHashSet<>();
        for (int i = 0; i < N; i++) {
            inputs.add(Integer.valueOf(br.readLine()));
        }
        /* Read all the values and put inside a hashset */
        /* then iterate through set and check for key + diff value */
        int count = 0;
        int diff = Integer.valueOf(br.readLine());
        // int diff = 3;
        for (Integer key : inputs) {
            if (inputs.contains(key + diff)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
