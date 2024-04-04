package com.learning.core.day1session2.D01P03;
import java.util.Scanner;
public class Factorial5 {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter a number to find its factorial: ");

	        // Read the input from the user
	        int number = scanner.nextInt();

	        // Calculate factorial
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        // Print the factorial value
	        System.out.println("The factorial of " + number + " is: " + factorial);

	        // Close the scanner
	        scanner.close();
	    }
	}