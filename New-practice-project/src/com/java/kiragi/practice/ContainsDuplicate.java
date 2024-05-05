package com.java.kiragi.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] intArray  = {0, -1, 5, -8, 9, 10, 12,9,9, 17, 9,12,46,36,2,7};
		Solution.printDuplicateKeyValue(intArray);
	}

	
}

class Solution{
	public static void checkDuplicates(int[] integerArray) {
		int[] arr = integerArray;
		ArrayList<Integer> integers = new  ArrayList<>();
		int count =0;
		for (int i : arr) {
			if(integers.contains(i)) {
				count++;
			}else {
				integers.add(i);
			}
		}
		System.out.println("There are "+count+ " duplicates in the given array");
	}
	
	public static void printDuplicateKeyValue(int[] integerArray) {
		int[] arr = integerArray;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		//System.out.println("The occurance in the given array are ");
	//	map.entrySet().forEach(e -> System.out.println( e.getKey() +" = "+e.getValue()));
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list.get(0));
		
		
	}
}

