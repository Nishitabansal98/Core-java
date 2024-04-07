package com.learning.core.day2session1.D02P05;

import java.util.ArrayList;
import java.util.List;

public class StringPatternMatcher7 {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("abb");
        dictionary.add("abc");
        dictionary.add("xyz");
        dictionary.add("xyy");
        dictionary.add("fw");

        String pattern = "xyy";
        List<String> matches = findMatchingStrings(dictionary, pattern);

        System.out.println("Strings matching the pattern '" + pattern + "': " + matches);
    }

    public static List<String> findMatchingStrings(List<String> dictionary, String pattern) {
        List<String> matches = new ArrayList<>();

        for (String word : dictionary) {
            if (word.equals(pattern)) {
                matches.add(word);
            }
        }

        return matches;
    }
}