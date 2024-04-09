package com.learning.core.day4session2.D03P10;

public class Search3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 4; // Element to search
        
        // Perform linear search
        int result = linearSearch(arr, x);
        
        // Output the result
        if (result == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Element found, return index
            }
        }
        return -1; // Element not found
    }
}