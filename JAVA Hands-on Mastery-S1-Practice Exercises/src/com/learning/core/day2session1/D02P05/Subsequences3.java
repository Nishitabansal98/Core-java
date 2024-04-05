package com.learning.core.day2session1.D02P05;
import java.util.Scanner;
public class Subsequences3 {
	    public static void main(String[] args) {
	    	System.out.print("Enter a string: ");
	    	Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        printSubsequences(input);
	    }

	    public static void printSubsequences(String str) {
	        int n = str.length();
	        for (int i = 0; i < (1 << n); i++) {
	            StringBuilder subsequence = new StringBuilder();
	            for (int j = 0; j < n; j++) {
	                if ((i & (1 << j)) > 0) {
	                    subsequence.append(str.charAt(j));
	                }
	            }
	            System.out.println(subsequence.toString());
	        }
	    }
	}