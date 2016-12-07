package com.nayakam.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WinnerFactor {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter number of Test Cases: ");
            int iteration = Integer.parseInt(bufferedReader.readLine());

            while (iteration-- > 0) {
                System.out.print("Target number: ");
                int n = Integer.parseInt(bufferedReader.readLine());
                int sum = 0;
                if (n == 1) {
                    sum = 1;
                } else if (n > 1) {
                    sum += (1 + n);
                    for (int i = 2; i <= n / 2; i++) {
                        if (n % i == 0) {
                            sum += i;
                        }
                    }
                }
                System.out.println("Case: " + iteration + ", Number: " + n + ", Target: " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}