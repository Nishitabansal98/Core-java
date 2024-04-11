package com.learning.core.day3session2.D03P08;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook2 {
    public static void main(String[] args) {
        // Create a HashMap to store phone book details
        Map<String, String> phoneBook = new HashMap<>();

        // Predefined phone book details
        phoneBook.put("John Doe", "123-456-7890");
        phoneBook.put("Jane Smith", "987-654-3210");
        phoneBook.put("Alice Johnson", "555-123-4567");
        phoneBook.put("Bob Brown", "777-888-9999");
        phoneBook.put("Eva Lee", "111-222-3333");

        // Search for a phone number
        String nameToSearch = "Jane Smith";
        String phoneNumber = phoneBook.get(nameToSearch);
        if (phoneNumber != null) {
            System.out.println("Phone number for " + nameToSearch + " is: " + phoneNumber);
        } else {
            System.out.println("No phone number found for " + nameToSearch);
        }
    }
}