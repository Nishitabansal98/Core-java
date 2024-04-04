package com.learning.core.day1session2.D01P03;
import java.util.Scanner;
public class Weekday2 {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter a number representing a day of the week (1-7): ");

	        // Read the input from the user
	        int dayNumber = scanner.nextInt();

	        // Check the input and print the corresponding weekday name
	        if (dayNumber == 1) {
	            System.out.println("Sunday");
	        } else if (dayNumber == 2) {
	            System.out.println("Monday");
	        } else if (dayNumber == 3) {
	            System.out.println("Tuesday");
	        } else if (dayNumber == 4) {
	            System.out.println("Wednesday");
	        } else if (dayNumber == 5) {
	            System.out.println("Thursday");
	        } else if (dayNumber == 6) {
	            System.out.println("Friday");
	        } else if (dayNumber == 7) {
	            System.out.println("Saturday");
	        } else {
	            System.out.println("Invalid input. Please enter a number between 1 and 7.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}