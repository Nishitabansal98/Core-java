package com.learning.core.day2session1.D02P05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CircleStrings5 {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("abc");
        strings1.add("crg");
        strings1.add("cde");
        strings1.add("ghi");
        strings1.add("i");
        strings1.add("j");
        strings1.add("a");
        System.out.println("Input 1:");
        System.out.println("Can form circle: " + canFormCircle(strings1));
        System.out.println("Order after forming circle:");
        printCircleOrder(strings1);

        List<String> strings2 = new ArrayList<>();
        strings2.add("i");
        strings2.add("j");
        strings2.add("k");
        strings2.add("kji");
        strings2.add("abc");
        strings2.add("cba");
        System.out.println("\nInput 2:");
        System.out.println("Can form circle: " + canFormCircle(strings2));
    }

    public static boolean canFormCircle(List<String> strings) {
        Map<Character, List<String>> adjacencyMap = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();

        // Create adjacency map based on last and first characters
        for (String str : strings) {
            char lastChar = str.charAt(str.length() - 1);
            char firstChar = str.charAt(0);
            adjacencyMap.putIfAbsent(lastChar, new ArrayList<>());
            adjacencyMap.get(lastChar).add(str);
            visited.put(str, false);
        }

        for (String str : strings) {
            if (!visited.get(str) && hasCycle(str, adjacencyMap, visited)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasCycle(String str, Map<Character, List<String>> adjacencyMap, Map<String, Boolean> visited) {
        visited.put(str, true);
        char lastChar = str.charAt(str.length() - 1);

        if (adjacencyMap.containsKey(lastChar)) {
            for (String nextStr : adjacencyMap.get(lastChar)) {
                if (!visited.get(nextStr)) {
                    if (hasCycle(nextStr, adjacencyMap, visited)) {
                        return true;
                    }
                } else {
                    return true;  // Cycle detected
                }
            }
        }
        visited.put(str, false);  // Backtrack
        return false;
    }

    public static void printCircleOrder(List<String> strings) {
        if (!canFormCircle(strings)) {
            System.out.println("Cannot form a circle.");
            return;
        }

        Map<Character, List<String>> adjacencyMap = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();

        // Create adjacency map based on last and first characters
        for (String str : strings) {
            char lastChar = str.charAt(str.length() - 1);
            char firstChar = str.charAt(0);
            adjacencyMap.putIfAbsent(lastChar, new ArrayList<>());
            adjacencyMap.get(lastChar).add(str);
            visited.put(str, false);
        }

        List<String> circleOrder = new ArrayList<>();
        String startStr = strings.get(0);
        buildCircleOrder(startStr, adjacencyMap, visited, circleOrder);

        System.out.println(String.join(", ", circleOrder));
    }

    private static void buildCircleOrder(String str, Map<Character, List<String>> adjacencyMap, Map<String, Boolean> visited, List<String> circleOrder) {
        circleOrder.add(str);
        visited.put(str, true);
        char lastChar = str.charAt(str.length() - 1);

        if (adjacencyMap.containsKey(lastChar)) {
            for (String nextStr : adjacencyMap.get(lastChar)) {
                if (!visited.get(nextStr)) {
                    buildCircleOrder(nextStr, adjacencyMap, visited, circleOrder);
                }
            }
        }
    }
}