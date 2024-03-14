package com.java.kiragi.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Akash 
 * 		This ClassPrint the element of odd and even occurrence of
 *         elements in a string while iterating over a List of Strings
 */
public class PrintEvenOddStringEle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		ArrayList<String> numArray = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			numArray.add(scanner.next());
		}
		Solutions.printNames(numArray);
	}
}

class Solutions {

	public static void printNames(ArrayList<String> list) {
		for (String str : list) {
			String oddString = "";
			String evenString = "" + str.charAt(0);
			for (int i = 1; i < str.length(); i++) {
				if (i % 2 == 0) {
					evenString = evenString + str.charAt(i);
				} else {
					oddString = oddString + str.charAt(i);
				}
			}
			System.out.println(evenString + " " + oddString);
		}
	}

}
