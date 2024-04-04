package com.learning.core.day1session2.D01P04;

public class FirstRepeatingIndex3 {
	    public static void main(String[] args) {
	        int[] arr = {7, 10, 5, 3, 4, 3, 5, 6};

	        // Initialize an array to keep track of the indices of each element
	        int[] indexArray = new int[101]; // Assuming elements range from 1 to 100

	        // Initialize the indexArray with -1 (indicating element not yet found)
	        for (int i = 0; i < indexArray.length; i++) {
	            indexArray[i] = -1;
	        }

	        // Iterate through the array and find the first reporting element
	        int firstReportingElementIndex = -1;
	        for (int i = 0; i < arr.length; i++) {
	            // If the current element has been seen before, update firstReportingElementIndex and break
	            if (indexArray[arr[i]] != -1) {
	                firstReportingElementIndex = indexArray[arr[i]];
	                break;
	            }
	            // Otherwise, mark the current element's index in the indexArray
	            indexArray[arr[i]] = i;
	        }

	        // Print the index of the first reporting element
	        System.out.println("Index of the first reporting element: " + firstReportingElementIndex);
	    }
	}