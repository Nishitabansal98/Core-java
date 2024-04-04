package com.learning.core.day1session2.D01P03;
import java.util.Scanner;
public class Pattern4 {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter the number of rows: ");

	        // Read the input from the user
	        int rows = scanner.nextInt();

	        // Generate the pattern
	        for (int i = 1; i <= rows; i++) {
	            // Print the numbers in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            // Move to the next line after printing each row
	            System.out.println();
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}