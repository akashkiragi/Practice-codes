package com.java.kiragi.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThreads {
	
	public static void main(String[] args) {
		
		List<Thread> threadsList = new ArrayList<>();
		
		Runnable stateMonitorRun = () -> 
		{
			try {
				while(true) {
					Thread.sleep(5000);
					printStateOfThread(threadsList);
				}
			} catch (InterruptedException e) {
				System.out.println("The state runner Thread was interepted");
			}
		};
		Thread reportThred = new Thread(stateMonitorRun);
		reportThred.setDaemon(true);
		reportThred.start();
		
		
		while(true) {
			System.out.println("\nPlease enter the num to calculate Fibinacci series");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n==0) {
				break;
			}
			Runnable r = () ->  FibinacciSeries.fibinocciWithoutRecursion(n);
			Thread t = new Thread(r);
			threadsList.add(t);
			t.start();
			
		}

	}
	
	public static void printStateOfThread(List<Thread> threadList) {
		System.out.print("\nThe state of the Threds are :: ");
		for (Thread thread : threadList) {
			System.out.print(thread.getState()+"  ");
		}
	}

}
