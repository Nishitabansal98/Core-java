package com.learning.core.day3session1.D03P07;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();

        System.out.println("Enter the list of student names separated by commas:");
        String input = scanner.nextLine();

        // Split the input string by commas and add names to the list
        String[] names = input.split(", ");
        for (String name : names) {
            studentList.add(name);
        }

        System.out.println("Enter the name to search:");
        String searchName = scanner.nextLine();

        // Check if the searchName exists in the list
        if (studentList.contains(searchName)) {
            System.out.println("Found.");
        } else {
            System.out.println("Not found.");
        }
    }
}