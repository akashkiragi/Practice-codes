package com.java.kiragi.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TimeFormat {
	
	public static void main(String[] args) {
		System.out.println(timeConversion("10:12:15PM"));
	}
	
	public static String timeConversion(String s) {
		/*
		 * List timeStamp = Arrays.asList(s.split(":", 3)); int hour =
		 * Integer.parseInt(timeStamp.get(0).toString()); hour =
		 * s.substring(8,10).equalsIgnoreCase("PM") ? hour+12 :hour; return
		 * " "+hour+":"+ timeStamp.get(1).toString()+":"+
		 * timeStamp.get(2).toString().substring(0,2);
		 */
		// Write your code here
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            Date inputDate = inputFormat.parse(s);
            return outputFormat.format(inputDate);
        } catch (ParseException pex) {

        }

        return null;
	}

}
