package com.learning.core.day2session1.D02P05;
public class LongestPrefixSuffix6 {
    public static void main(String[] args) {
        String input1 = "aabcdaabc";
        System.out.println("Input: " + input1);
        int length1 = findLongestPrefixSuffix(input1);
        System.out.println("Output: " + length1);

        String input2 = "abcab";
        System.out.println("Input: " + input2);
        int length2 = findLongestPrefixSuffix(input2);
        System.out.println("Output: " + length2);
    }

    public static int findLongestPrefixSuffix(String str) {
        int n = str.length();
        int[] lps = computeLPSArray(str);

        // Length of the longest prefix that is also a suffix
        return lps[n - 1];
    }

    public static int[] computeLPSArray(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix

        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}