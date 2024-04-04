package com.learning.core.day1session2.D01P04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DistinctCombination4 {
	
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        int k = 2;
	        List<List<Integer>> result = findCombinations(nums, k);
	        System.out.println("Distinct combinations of size " + k + ":");
	        for (List<Integer> combination : result) {
	            for (int num : combination) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static List<List<Integer>> findCombinations(int[] nums, int k) {
	        List<List<Integer>> result = new ArrayList<>();
	        Arrays.sort(nums); // Sort the array to handle duplicates properly
	        backtrack(nums, k, 0, new ArrayList<>(), result);
	        return result;
	    }

	    private static void backtrack(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
	        if (current.size() == k) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < nums.length; i++) {
	            // Skip duplicates
	            if (i > start && nums[i] == nums[i - 1]) {
	                continue;
	            }
	            current.add(nums[i]);
	            backtrack(nums, k, i + 1, current, result);
	            current.remove(current.size() - 1);
	        }
	    }
	}