package com.java.kiragi.practice.std;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class EmployeeComparableComparator implements Comparable<EmployeeComparableComparator> {

	private int id;
	private String firstName;
	private String lastName;
	private String dept;
	private int salary;

	public EmployeeComparableComparator() {
	}

	public EmployeeComparableComparator(int id, String firstName, String lastName, String dept, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, id, firstName, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeComparableComparator other = (EmployeeComparableComparator) obj;
		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(firstName, other.firstName)
				&& salary == other.salary;
	}

	@Override
	public String toString() {
		return "The name of the Employee is " + this.firstName + " " + this.lastName + " with the ID " + this.id
				+ " having the slary of " + this.salary;
	}

	/**
	 * @param employee object and compares with other during the sort
	 * @return positive or the negative based on the comparison of First Name else
	 *         returns the value of the last name comparison
	 */
	@Override
	public int compareTo(EmployeeComparableComparator emp) {

		/*
		 * int comparisonIntValue = this.firstName.compareTo(emp.firstName); if
		 * (comparisonIntValue != 0) return comparisonIntValue; else return
		 * this.lastName.compareTo(emp.lastName);
		 */

		return this.firstName.compareTo(emp.firstName) != 0 ? this.firstName.compareTo(emp.firstName)
				: this.lastName.compareTo(emp.lastName);

	}

	public static void comparableMethod(List<EmployeeComparableComparator> empList) {
		Collections.sort(empList);

	}

	public static void comparatorMethod(List<EmployeeComparableComparator> empList) {
		Comparator<EmployeeComparableComparator> emnployeeFLComparator = Comparator
				.comparing(EmployeeComparableComparator::getFirstName).thenComparing(EmployeeComparableComparator::getLastName);
		
		Comparator<EmployeeComparableComparator> emnployeeComparator = Comparator
				.comparing(EmployeeComparableComparator::getFirstName);
		
		Collections.sort(empList, emnployeeComparator);

	}

	private static List<EmployeeComparableComparator> employeeInitialize() {
		List<EmployeeComparableComparator> empList = new ArrayList<EmployeeComparableComparator>();
		empList.add(new EmployeeComparableComparator(1, "Akash", "Kiragi", "Software", 5000));
		empList.add(new EmployeeComparableComparator(2, "Anjali", "Kiragi", "Software", 5000));
		empList.add(new EmployeeComparableComparator(21, "Anjali", "Eranna", "Software", 5000));
		empList.add(new EmployeeComparableComparator(20, "Anjali", "Veeranna", "Software", 5000));
		empList.add(new EmployeeComparableComparator(15, "Akash", "Veeranna", "Software", 5000));
		empList.add(new EmployeeComparableComparator(10, "Ankita", "Shreeedhar", "Software", 5000));
		empList.add(new EmployeeComparableComparator(16, "Ankita", "Kiragi", "Software", 5000));
		return empList;
	}

	public static void main(String[] args) {
		List<EmployeeComparableComparator> empList = employeeInitialize();
		comparatorMethod(empList);
		//comparableMethod(empList);

		for (EmployeeComparableComparator employee : empList) {
			System.out.println(employee.toString());
		}
	}

}
