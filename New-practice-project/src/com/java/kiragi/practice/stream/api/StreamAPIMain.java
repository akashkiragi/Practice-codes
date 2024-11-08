package com.java.kiragi.practice.stream.api;

import java.util.Arrays;
import java.util.List;

public class StreamAPIMain {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(0, -1, 5, -8, 9, 10, 12,32, 17, 20);	
		
		new FilteringandCounting().filterEvenIntCount(numberList);

	}

}
