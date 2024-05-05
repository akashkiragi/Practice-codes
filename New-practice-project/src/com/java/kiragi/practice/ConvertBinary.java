package com.java.kiragi.practice;

class ResultB {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        String bit = Long.toBinaryString( n & 0xffffffffL | 0x100000000L ).substring(1);
        char[] cs = bit.toCharArray();
        StringBuilder buffer = new StringBuilder();
        for (char c : cs) {
            if(c != '0'){
                buffer.append('0');
            }else{
                buffer.append('1');
            }
        }
       return Long.parseLong(buffer.toString(),2);

    }

}

public class ConvertBinary {
    public static void main(String[] args) {
    	System.out.println(ResultB.flippingBits(12));
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int q = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * for (int qItr = 0; qItr < q; qItr++) { long n =
		 * Long.parseLong(bufferedReader.readLine().trim());
		 * 
		 * long result = Result.flippingBits(n);
		 * 
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine(); }
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
    	
    	
    }
}
