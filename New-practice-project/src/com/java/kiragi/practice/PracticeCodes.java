package com.java.kiragi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PracticeCodes {
	
	public static void main(String[] args) {
		
		PrototypeClass class1= 	PrototypeClass.getInstance();
		PrototypeClass class2= 	PrototypeClass.getInstance();
		PrototypeClass class3= 	PrototypeClass.getInstance();
		
		/*
		 * Integer arrList[] = {63 , 25 , 73 , 1 , 98 , 73 , 56 , 84 , 86 , 57 , 16 , 83
		 * , 8 , 25 , 81 , 56 , 9 , 53 , 98 , 67 , 99 , 12 , 83 , 89 , 80 , 91 , 39 , 86
		 * , 76 , 85 , 74 , 39 , 25 , 90 , 59 , 10 , 94 , 32 , 44 , 3 , 89 , 30 , 27 ,
		 * 79 , 46 , 96 , 27 , 32 , 18 , 21 , 92 , 69 , 81 , 40 , 40 , 34 , 68 , 78 , 24
		 * , 87 , 42 , 69 , 23 , 41 , 78 , 22 , 6 , 90 , 99 , 89 , 50 , 30 , 20 , 1 , 43
		 * , 3 , 70 , 95 , 33 , 46 , 44 , 9 , 69 , 48 , 33 , 60 , 65 , 16 , 82 , 67 , 61
		 * , 32 , 21 , 79 , 75 , 75 , 13 , 87 , 70 , 33};
		 * 
		 * List<Integer> arr = Arrays.asList(arrList); String str =
		 * "We promptly judged antique ivory buckles for the prize"; String str2 =
		 * "The quick brown fox jumps over the lazy dog"; String str1 =
		 * "Complete the function pangrams in the editor below. It should return the string"
		 * ; System.out.println(Paragram.paragram(str));
		 */
		
		
	}	
	
}
class CountAndSort{
	public static List<Integer> countingSort(List<Integer> arr) {
	    List<Integer> result = new ArrayList<>(Collections.nCopies(100, 0));
	
		for (int num : arr) {
		    result.set(num, result.get(num) + 1);
		}
		return result; 
	
	}
}

class Paragram{
	public static String paragram(String str) {
	   
		String  resString = "";
		
		str = str.replaceAll("\\s", "").toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i)+1, 1));
		}
		int size = map.size();
		
		return size ==26 ? "pangram" : "non pangram";
	
	}
	
	public static String paragramStr(String str) {
		   
		String  resString = "";
		
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		
		//long size = str.stream()
		return "";
	
	}
	
}


class StringBuffer{
	public static void stringBuffer() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if(s1.length()<15){
                StringBuilder builder = new StringBuilder(s1);
                for (int j = 0; j < 15-s1.length(); j++) {
                    builder.append(' ');                         
                }
                s1=builder.toString();
            }
            String numString = Integer.toString(x);
            if (numString.length()<3) {
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < 3-s1.length(); j++) {
                    builder.append('0');                         
                }
                builder.append(numString);
                numString=builder.toString();        
            }
            System.out.println(s1+numString);
        }
        System.out.println("================================");
        }
	
	
}

class PrototypeClass{
	
	private static final PrototypeClass prototypeInstance = new PrototypeClass();
	private static final PrototypeClass prototypeInstance1 = new PrototypeClass();
	private static int count = 0;
	
	private PrototypeClass() {
		
	} 
	
	public static PrototypeClass getInstance(){
		if(count == 0) { count++; return prototypeInstance;}
		else if(count==1) {count++; return prototypeInstance1;}
		else throw new IllegalStateException("unable to create more Instance");
	}	
	
	
	
}



class FibinacciSeries{
	static int fibinocci(int integer) {
		if(integer == 0 ) {
			return 0;
		}else if( integer == 1){
			return 1;
		}
		else {
			return fibinocci(integer-2)+fibinocci(integer-1);
		}
	}
	static void fibinocciWithoutRecursion(int integer) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i <= integer; i++) {
			System.out.print(a+ ", ");
			a = b;
			b = c;
			c = a+b;
		}
	}
}

class Palidrome{
	
	static void toCheckTheIntegerPalidrome(int integer) {
		int num = integer;
		int reverseNum = 0;
		while(num!=0) {
			int val = num%10;
			reverseNum = reverseNum*10 + val;
			num/=10;
		}		
		if(integer == reverseNum)
			System.out.println("The given number " +integer+ " is Palindrome");
		else 
			System.out.println("The given number " +integer+ " is NOT Palindrome");
		
	}
	static void toCheckTheStringPalidrome(String string) {
		String str = string.toLowerCase();
		int len = str.length();
		Boolean value = true;
		for (int i = 1; i <= len/2; i++) {
			value = (str.charAt(i) != str.charAt(len - i)); 
		}
		if(value)
			System.out.println("The given String  " +string+"  is Palindrome");
		else 
			System.out.println("The given String is " +string+ "  NOT Palindrome");
	}
}

class MaximumProfit{
	static void maxProfitValue(int[] integerArray) {
		int[] arr = integerArray;
		int buy = integerArray[0];
		int maxProfit = 0;
		for (int value : arr) {
			if (buy > value)
				buy = value;
			else
				maxProfit = Integer.max(maxProfit, value - buy);
		}
		System.out.println("The max profit can Get for the following integers" + maxProfit);
	}
}


