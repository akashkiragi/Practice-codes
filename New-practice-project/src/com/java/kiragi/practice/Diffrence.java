package com.java.kiragi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int[] a){
        this.elements = a;
    }
    public void computeDifference(){
    	
    	List<Integer> integers = new ArrayList<Integer>();
    	for (int i = 0; i < elements.length; i++) {
    		integers.add(elements[i]);
		}
        integers.sort(Comparator.naturalOrder());
        maximumDifference = integers.get(integers.size()-1) - integers.get(0);
    }
    public int maximumDifference(){
        return maximumDifference;
    }

	// Add your code here

} // End of Difference class

public class Diffrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}