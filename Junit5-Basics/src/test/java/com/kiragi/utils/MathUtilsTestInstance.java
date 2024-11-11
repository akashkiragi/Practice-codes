package com.kiragi.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
class MathUtilsTestInstance {
	
	/**
	 * beforeAll and AfterAll are declared without static keyword
	 * when it annotated with @TestInstance
	 */
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This is the before all Method");
	}

	@AfterAll
	static void afterAllInit() {
		System.out.println("This is the After all Method");
	}
	
	@Test
	@DisplayName("The Addition test")
	void testAddMathUtils() {
		MathUtils mathUtils = new MathUtils();
		int expectedVal = 2;
		int actualVal = mathUtils.addTwoNm(1, 1);
		assertEquals(expectedVal, actualVal);
	}
	
	@Test
	@DisplayName("Test to calculate Area of circle")
	void testAreaOfCirecle() {
		MathUtils mathUtils = new MathUtils();
		
		assertEquals(314.2, mathUtils.calculateAreOfCirecle(10));
	}
	
	/*
	 * this method is for the assert throws where it works similar to try catch
	 * if zero is passed throw a fail or throw an exception
	 */
	@Test
	@DisplayName("Test to verify Divide Methoda nd assertThrow")
	void testDividdeMethod() {
		MathUtils mathUtils = new MathUtils();
		System.out.println(mathUtils.divideTwoNm(1,1));
		//assertFalse(mathUtils.divideTwoNm(1,1) < 0);
		assertThrows(ArithmeticException.class, () -> mathUtils.divideTwoNm(1,0), "Exception occured as it divide by zero");
	}
	
	
	/**
	 * This is the Disabled test case which will be marked as cross
	 * where it is neither pass nor fail
	 */
	@Test
	@DisplayName("This is the TDD disable test")
	@Disabled
	void disabledTest() {
		fail("This test is disabled ");
	}
}
