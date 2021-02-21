package com.stringcalulator.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stringcalculator.tdd.StringCalculator;

public class StringCalculatorTest {
	StringCalculator sc = new StringCalculator();

	@Test
	public void emptyStringTest() {
		String inputString = "";
		int expected = 0;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void onlyOneNumberTest() {
		String inputString = "3";
		int expected = 3;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void twoNumbersTest() {
		String inputString = "2,3";
		int expected = 5;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void unknownAmountOfNumbersTest() {
		String inputString = "2,3,7,2,5,1";
		int expected = 20;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void stringWithNewLinesTest() {
		String inputString = "2\n3,7,2\n5,1";
		int expected = 20;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void differentDelimeterTest() {
		String inputString = "“//;\n1;2";
		int expected = 3;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}
}
