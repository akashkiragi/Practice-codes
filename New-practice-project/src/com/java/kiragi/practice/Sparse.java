package com.java.kiragi.practice;

import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */
	 public static final String WEIRD = "Weird";
	 public static final String NOT_WEIRD = "Not Weird";
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    		Map<String, Integer> frequencyMap = new HashMap<>();
            
			/*
			 * for (String querryString : queries) { if(strings.contains(querryString) &&
			 * map.get(querryString) != null ){ map.put(querryString, (int)
			 * map.get(querryString)+1);
			 * 
			 * }else{ map.put(querryString, 1); } }
			 */
            
            for (String querryString : strings) {
            	 frequencyMap.put(querryString, frequencyMap.getOrDefault(querryString, 0) + 1);
            }
            List result = new ArrayList<>();
            for (String query : queries) {
                result.add(frequencyMap.getOrDefault(query, 0));
            }
            
            return  result;

    }

}

public class Sparse {
    public static void main(String[] args) throws IOException {
       
        int stringsCount = 4;
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.next();
            strings.add(stringsItem);
        }

        int queriesCount = 3;

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem =  scanner.next();
            queries.add(queriesItem);
        }
        scanner.close();
        
        List<Integer> res = Result.matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
        	System.out.println(res.get(i));
        }
        
    }
}

class LambdaExpressions {
    public static void main(String[] args) {
        // Example usage
        System.out.println("Is Odd: " + performOperation(5, isOdd()));
        System.out.println("Is Prime: " + performOperation(7, isPrime()));
        System.out.println("Is Palindrome: " + performOperation(121, isPalindrome()));
    }

    static boolean performOperation(int number, IntPredicate operation) {
        return operation.test(number);
    }

    static IntPredicate isOdd() {
        return num -> num % 2 != 0;
    }

    static IntPredicate isPrime() {
        return num -> num > 1 && java.util.stream.IntStream.range(2, (int) Math.sqrt(num) + 1).noneMatch(i -> num % i == 0);
    }

    static IntPredicate isPalindrome() {
        return num -> {
            String strNum = Integer.toString(num);
            return new StringBuilder(strNum).reverse().toString().equals(strNum);
        };
    }
}