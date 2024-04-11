package com.learning.core.day3session2.D03P08;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook1 {
    public static void main(String[] args) {
        // Create a HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();

        // Add phone book details
        phoneBook.put("John Doe", "123-456-7890");
        phoneBook.put("Jane Smith", "987-654-3210");
        phoneBook.put("Alice Johnson", "555-123-4567");
        phoneBook.put("Bob Brown", "777-888-9999");
        phoneBook.put("Eva Lee", "111-222-3333");

        // List all phone book details
        System.out.println("Phone Book Details:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
}