package com.learning.core.day1session2.D01P03;
import java.util.Scanner;
public class Grade3 {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter the percentage marks obtained: ");

	        // Read the input from the user
	        double percentage = scanner.nextDouble();

	        // Check the percentage and assign the grade
	        char grade;
	        if (percentage >= 60) {
	            grade = 'A';
	        }
	            else if (percentage >= 45) {
		            grade = 'B';
	            }
		            else if (percentage >= 35) {
			            grade = 'C';
	        } else {
	            grade = 'F'; // Default to grade F if percentage is below 60%
	        }
	        // Print the grade
	        System.out.println("The grade is: " + grade);

	        // Close the scanner
	        scanner.close();
	    }
	        
}