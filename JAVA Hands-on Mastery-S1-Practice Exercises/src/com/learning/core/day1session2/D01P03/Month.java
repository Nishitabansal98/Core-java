package com.learning.core.day1session2.D01P03;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Array to hold month names
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Prompt the user for input
        System.out.print("Enter a number between 1 and 12: ");
        
        // Read the input from the user
        int monthNumber = scanner.nextInt();

        // Validate input and display the corresponding month name
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("The month is: " + monthNames[monthNumber - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        // Close the scanner
        scanner.close();
    }
}