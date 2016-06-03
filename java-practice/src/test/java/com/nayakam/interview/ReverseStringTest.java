package com.nayakam.interview;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void shouldReverseString() {
        String input = "this should be reversed";
        System.out.println("Test String:" + input);
        System.out.println("reverseStringUsingArray:" + ReverseStringUtil.reverseStringUsingArray(input));
        System.out.println("reverseStringUsingQueue:" + ReverseStringUtil.reverseStringUsingQueue(input));
        System.out.println("reverseStringRecursive:" + ReverseStringUtil.reverseStringRecursive(input));
        System.out.println("reverseString1:" +ReverseStringUtil.reverseString1(input));
        System.out.println("reverseStringUsingBitwiseXOR:" +ReverseStringUtil.reverseStringUsingBitwiseXOR(input));
    }
}