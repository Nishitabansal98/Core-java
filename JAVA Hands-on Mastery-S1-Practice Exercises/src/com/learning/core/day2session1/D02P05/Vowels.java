package com.learning.core.day2session1.D02P05;
import java.util.Scanner;
public class Vowels {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        int vowelCount = 0;
	        int consonantCount = 0;
	        
	        input = input.toLowerCase(); // Convert input to lowercase for easier vowel checking
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            	 System.out.println("Number of vowels: " + ch);
	                vowelCount++;
	            } else if (ch >= 'a' && ch <= 'z') {
	                consonantCount++;
	            }
	        }
	        
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	        
	        if (consonantCount < vowelCount) {
	            System.out.println("Match in vowel count!");
	        }
	    }
	}