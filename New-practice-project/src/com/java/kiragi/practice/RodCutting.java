package com.java.kiragi.practice;
public class RodCutting {

    public static int cutRod(int[] prices, int n) {
        if (n <= 0) {
            return 0;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int currentVal = prices[i] + cutRod(prices, n - i);
            maxVal = Math.max(maxVal, currentVal);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;

        int maxValue = cutRod(prices, rodLength);

        System.out.println("Maximum obtainable value: " + maxValue);
    }
}
