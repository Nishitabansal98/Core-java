package com.learning.core.day2session1.D02P05;
import java.util.Scanner;
public class Palindrom1Array {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Displaying the length of the string
	        int length = inputString.length();
	        System.out.println("Length of the string: " + length);

	        // Converting the string to uppercase
	        String uppercaseString = inputString.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);

	        // Checking if the string is a palindrome
	        boolean isPalindrome = checkPalindrome(inputString);
	        if (isPalindrome) {
	            System.out.println("It is a palindrome.");
	        } else {
	            System.out.println("It is not a palindrome.");
	        }

	        scanner.close();
	    }

	    public static boolean checkPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	}