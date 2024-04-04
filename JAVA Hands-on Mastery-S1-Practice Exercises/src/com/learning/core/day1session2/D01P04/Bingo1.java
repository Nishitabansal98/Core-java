package com.learning.core.day1session2.D01P04;
import java.util.Scanner;
public class Bingo1 {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Initialize the array with five random numbers ranging from 1 to 40
	        int[] numbers = {5, 10, 15, 20, 25};

	        // Prompt the user for input
	        System.out.print("Enter the first number (1-40): ");
	        int number1 = scanner.nextInt();

	        System.out.print("Enter the second number (1-40): ");
	        int number2 = scanner.nextInt();

	        // Check if both inputed numbers are found in the array
	        boolean foundNumber1 = false;
	        boolean foundNumber2 = false;

	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == number1) {
	                foundNumber1 = true;
	            }
	            if (numbers[i] == number2) {
	                foundNumber2 = true;
	            }
	        }
	        // Display the result
	        if (foundNumber1 && foundNumber2) {
	            System.out.println("BINGO!");
	        } else {
	            System.out.println("Not found in the array.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}