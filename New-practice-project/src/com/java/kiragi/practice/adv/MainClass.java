package com.java.kiragi.practice.adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.kiragi.practice.std.EmployeeComparableComparator;

public class MainClass {

	public static void main(String[] args) {
		
		List<EmployeeComparableComparator> empList = new ArrayList<EmployeeComparableComparator>();
		
		empList.add(new EmployeeComparableComparator(1, "Akash", "Kiragi", "Software", 5000));
		empList.add(new EmployeeComparableComparator(2, "Anjali", "Kiragi", "Software", 5000));
		empList.add(new EmployeeComparableComparator(21, "Anjali", "Eranna", "Software", 5000));
		empList.add(new EmployeeComparableComparator(15, "Akash", "Veeranna", "Software", 5000));
		empList.add(new EmployeeComparableComparator(10, "Ankita", "Shreeedhar", "Software", 5000));
		empList.add(new EmployeeComparableComparator(16, "Ankita", "Kiragi", "Software", 5000));
		
		Collections.sort(empList);
		
		for (EmployeeComparableComparator employee : empList) {
			System.out.println(employee.toString());
		}
		
	}

}
