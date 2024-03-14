package com.java.kiragi.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeCodes {
	
	public static void main(String[] args) {
	
		
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


