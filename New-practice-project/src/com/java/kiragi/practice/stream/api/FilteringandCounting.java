package com.java.kiragi.practice.stream.api;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Given a list of integers, filter out the even numbers and count how many there are.
 */
public class FilteringandCounting {
	
	public void filterEvenIntCount(List<Integer> numList) {
		
		//List<Integer> list = numList.stream().filter(n -> n%2==0).collect(Collectors.toList());
	
		 Map<Integer, String> numberTypeMap = numList.stream()
	                .collect(Collectors.toMap(
	                        (Integer number) -> number, // Key: the number itself
	                        (Integer number) -> (number % 2 == 0) ? "even" : "odd" // Value: "even" or "odd"
	                ));
		System.out.println(numberTypeMap);
		//Map<Integer, String> mapOfEvenOdd = numList.stream().filter(n -> n%2==0).collect(Collectors.toMap((Integer n)-> n, (Integer n) -> (n%2==0)?"even":"odd"));
		//System.out.println(list);
		
		int count = (int) numList.stream().filter(n -> n%2==0).count();
		
	}

}
