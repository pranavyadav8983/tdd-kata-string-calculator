package com.stringcalulator.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stringcalculator.tdd.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void emptyStringTest() {
		String inputString="";
		int expected=0;
		StringCalculator sc= new StringCalculator();
		int actual=sc.Add(inputString);
		assertEquals(expected, actual);
	}
	
}
