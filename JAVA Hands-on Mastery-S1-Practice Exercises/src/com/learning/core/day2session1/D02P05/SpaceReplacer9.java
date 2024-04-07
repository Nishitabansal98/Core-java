package com.learning.core.day2session1.D02P05;
public class SpaceReplacer9 {
    public static void main(String[] args) {
        String input = "Mr. John Smith";
        String replaced = replaceSpaces(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + replaced);
    }

    public static String replaceSpaces(String input) {
        return input.replace(" ", "%20");
    }
}