package com.java.kiragi.practice;

import java.util.Arrays;
import java.util.List;


public class Practice {

	public static void main(String[] args) {
		List<Integer> intArray  = Arrays.asList(0, -1, 5, -8, 9, 10, 12,9,9, 17, 9,12,46,36,2,7);
		//new KadanesAlgo().returnMaxSumOfContigousArry(intArray);
		//new BuSellStock().getMaxProfit(intArray);
		new RegEx().printNum(20);
		
	}

}

class KadanesAlgo{
	
	public int returnMaxSumOfContigousArry(List<Integer> arr) {
		
		int maximumVal =  Integer.MIN_VALUE;
		int currMax = 0;
		
		for (Integer integer : arr) {
			currMax+=integer;
			maximumVal = Math.max(maximumVal, currMax);
			currMax = currMax < 0 ?  0 : currMax;
			
		}
		System.out.println(maximumVal);
		
		return Integer.MAX_VALUE;
		
	}
	
}

class BuSellStock{
	
	//(-2, -3, 4, -1, -2, 1, 5, -3 );
	 public void getMaxProfit(List<Integer> arr) {
		
		 int buy = arr.get(0);
		 int maxProfit = Integer.MIN_VALUE;
		 
		 for (Integer integer : arr) {			
			 buy = Math.min(buy, integer);		 
			 maxProfit = Math.max(maxProfit, integer -  buy);
		}
		 System.out.println(maxProfit);
	}
	
	
}

class RegEx{
	
	public void regExPaternMatch() {
								
		 String zero = "(2[0-4][0-9]|25[0-5]|[01]?[0-9][0-9]?)";
		
		    String pattern = zero +  "\\." + zero +"\\."+zero +  "\\." + zero ;
		    
		    
		    System.out.println(pattern);
		    String ip = "10.60.0.100";
		    System.out.println(ip.matches(pattern));
		//	(0|1)\\d{2}  000 - 199
		// 	2[0-4]\\d	200 - 249
		// 	25[0-5]		250 - 255
		// \\d{1} 	0 - 9
		// \\d{2}
		/*
		 * for (int i = 0; i <= 2550; i++) { String str = i+""; if(
		 * str.matches(zeroPattern) ) System.out.println(i); }
		 */
		
		/*
		 * String pattern = "^[A-Z]{3}H[A-Z]\\d{4}[A-Z]$";
		 * 
		 * System.out.println(("HBDHK1612P").matches(pattern));
		 */
	}
	
	 public static void printNum(int n){
		 int sum = 0;
		 
		  for (int i = 1; i < n; i++) {
	        	 if (i % 3 == 0 || i % 5 == 0) {
	                 sum+= i;
	             }
			}
		  System.out.println(sum);
		  System.out.println();
		  System.out.println();
	           sum = 0;
				/*
				 * for (int i = n - 1; i >= 3; i--) { if (i % 3 == 0 || i % 5 == 0) { sum+= i; }
				 * }
				 * 
				 */
	          int count = 0;
	         for (int i = 1; i <= n/2; i++) {
	        	 if (i % 3 == 0 || i % 5 == 0) {
	        		 count++;
	                 //sum+= i;
	                 //System.out.println(i);
	             }
			}
	         System.out.println(count/2);
	         //System.out.println(sum);
	         sum = 23;
	        for (int i = 1; i <= count/2; i++) {
				sum = i*sum;
				  System.out.println(sum);
			}
	    }
	
}







































































