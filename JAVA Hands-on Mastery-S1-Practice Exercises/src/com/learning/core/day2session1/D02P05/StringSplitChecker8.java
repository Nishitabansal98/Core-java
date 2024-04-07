package com.learning.core.day2session1.D02P05;
import java.util.HashSet;
import java.util.Set;

public class StringSplitChecker8 {
    public static void main(String[] args) {
        String input = "helloworld";
        String[] possibleInputs = {"hello", "world"};

        boolean canBeSplit = checkIfCanBeSplit(input, possibleInputs);

        if (canBeSplit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checkIfCanBeSplit(String input, String[] possibleInputs) {
        Set<String> inputSet = new HashSet<>();
        for (String possibleInput : possibleInputs) {
            if (input.contains(possibleInput)) {
                inputSet.add(possibleInput);
            }
        }

        return inputSet.size() == possibleInputs.length;
    }
}