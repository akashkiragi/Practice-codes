package com.java.kiragi.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class PossitiveNegetive {

	public static void main(String[] args) {	
		List<Integer> numberList = Arrays.asList(0, -1, 5, -8, 9, 10, 12,0,32, 17, 20);		
		FindPosNeg.second(numberList);
	}
}



class FindPosNeg{	
	public static void one(List<Integer> integers) {	
		int positiveNum = (int) integers.stream().filter(n -> n > 0).count();		
		int negetiveNnum = (int) integers.stream().filter(n -> n < 0).count();
		int zero = (int) integers.stream().filter(n -> n == 0).count();		
		
		System.out.println("Number of positive Num are " + positiveNum);
		System.out.println("Number of negetive Num are " + negetiveNnum);
		System.out.println("Number of Zero Num are " + zero);		
	}	
	public static void second(List<Integer> integers) {		
		 integers.stream().collect(Collectors.groupingBy((n -> {
										if(n>0) return "Positive";
										else if (n<0) return "Negetive";
										else return "Zero";			
									}), Collectors.counting())).entrySet().forEach(e-> System.out.println(e.getKey()+" numbers are "+e.getValue()));
		 								/*.entrySet().stream().map(Map.Entry::getValue)
         									.collect(Collectors.toList());*/
		 
		 //.entrySet().forEach(e-> System.out.println(e.getKey()+" numbers are "+e.getValue()));
	}
}
