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
	
	@Test
	public void onlyOneNumberTest() {
		String inputString="3";
		int expected=3;
		StringCalculator sc= new StringCalculator();
		int actual=sc.Add(inputString);
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoNumbersTest() {
		String inputString="2,3";
		int expected=5;
		StringCalculator sc= new StringCalculator();
		int actual=sc.Add(inputString);
		assertEquals(expected, actual);
	}
	
	@Test
	public void unknownAmountOfNumbersTest() {
		String inputString="2,3,7,2,5,1";
		int expected=20;
		StringCalculator sc= new StringCalculator();
		int actual=sc.Add(inputString);
		assertEquals(expected, actual);
	}

}
