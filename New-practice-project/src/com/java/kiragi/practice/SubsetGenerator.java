package com.java.kiragi.practice;
import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {
    public static void main(String[] args) {
    	int[] array = {256741038, 623958417 ,467905213 ,714532089 ,938071625};
        int subsetLength = 4;
        
       //int[] array = {10, 20, 30, 40};

        List<Integer> allSubsets = generateSubsets(array, subsetLength);
        System.out.println(allSubsets);

		int minValue = allSubsets.stream().min((x, y) -> Integer.compare(x, y)).get();
		int maxValue = allSubsets.stream().max((x, y) -> Integer.compare(x, y)).get();

		System.out.println(minValue + " " + maxValue);
		 
        
    }

    private static List<Integer> generateSubsets(int[] array, int subsetLength) {
        List<Integer>allSubsets = new ArrayList<>();
        generateSubsetsHelper(array, subsetLength, 0, new ArrayList<>(), allSubsets);
        return allSubsets;
    }

    private static void generateSubsetsHelper(int[] array, int subsetLength, int start, List<Integer> currentSubset, List<Integer> allSubsets) {
        if (subsetLength == 0) {
            // Subset of the required length is found, add it to the result
            allSubsets.add( currentSubset.stream().reduce(0, (x,y) -> x+y ));
            return;
        }

        for (int i = start; i < array.length; i++) {
            // Include the current element in the subset
            currentSubset.add(array[i]);

            // Recursively generate subsets with the remaining elements
            generateSubsetsHelper(array, subsetLength - 1, i + 1, currentSubset, allSubsets);

            // Exclude the current element (backtrack for the next iteration)
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
