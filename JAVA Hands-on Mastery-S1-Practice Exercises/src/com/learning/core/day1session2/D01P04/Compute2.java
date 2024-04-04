package com.learning.core.day1session2.D01P04;

public class Compute2 {
	    public static void main(String[] args) {
	        // Given integer array
	        int[] a = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

	        // A. Compute the sum of elements from index 0 to 14 and store it at element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += a[i];
	        }
	        a[15] = sum;

	        // B. Compute the average of all the numbers and store it at element 16
	        double average = (double) sum / 15; // Since we're summing 15 elements
	        a[16] = (int) Math.round(average); // Round the average and store it as an integer

	        // C. Identify the smallest value from the array and store it at element 17
	        int smallest = a[0];
	        for (int i = 1; i < a.length; i++) {
	            if (a[i] < smallest) {
	                smallest = a[i];
	            }
	        }
	        a[17] = smallest;

	        // Display the modified array
	        System.out.println("Modified array:");
	        for (int num : a) {
	            System.out.print(num + " ");
	        }
	    }
	}