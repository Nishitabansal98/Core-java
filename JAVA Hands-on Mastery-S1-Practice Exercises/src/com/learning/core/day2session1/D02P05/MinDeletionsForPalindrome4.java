package com.learning.core.day2session1.D02P05;

import java.util.Scanner;

public class MinDeletionsForPalindrome4 {
    public static void main(String[] args) {
    	System.out.print("Enter a string: ");
    	Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();;
        int deletions = minDeletionsForPalindrome(input);
        System.out.println("Minimum number of deletions to make the string palindrome: " + deletions);
    }

    public static int minDeletionsForPalindrome(String str) {
        int n = str.length();
        // Create a 2D array to store the number of deletions needed for substrings
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }
}