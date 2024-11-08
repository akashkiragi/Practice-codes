package com.kiragi.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		
		
		MathUtils mathUtils = new MathUtils();
		int expectedVal = 2;
		int actualVal = mathUtils.addTwoNm(1, 4);
		assertEquals(expectedVal, actualVal);
		
	}

}
