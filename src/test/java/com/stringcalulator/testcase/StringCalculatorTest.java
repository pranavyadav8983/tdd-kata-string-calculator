package com.stringcalulator.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stringcalculator.tdd.NegativeNumberException;
import com.stringcalculator.tdd.StringCalculator;

public class StringCalculatorTest {
	StringCalculator sc = new StringCalculator();

	@Test
	public void emptyStringTest() throws NegativeNumberException {
		String inputString = "";
		int expected = 0;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void onlyOneNumberTest() throws NegativeNumberException {
		String inputString = "3";
		int expected = 3;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void twoNumbersTest() throws NegativeNumberException {
		String inputString = "2,3";
		int expected = 5;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void unknownAmountOfNumbersTest() throws NegativeNumberException {
		String inputString = "2,3,7,2,5,1";
		int expected = 20;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void stringWithNewLinesTest() throws NegativeNumberException {
		String inputString = "2\n3,7,2\n5,1";
		int expected = 20;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void differentDelimeterTest() throws NegativeNumberException {
		String inputString = "//;\n1;2";
		int expected = 3;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test(expected = NegativeNumberException.class)
	public void negativeNumbersTest() throws NegativeNumberException {
		String inputString = "//;\n1;2;-3;-2";
		int actual = sc.Add(inputString);
	}

	@Test
	public void getCalledCountTest() {
		int expected = 8;
		int actual = sc.GetCalledCount();
		assertEquals(expected, actual);
	}

	@Test
	public void largerNumbersTest() throws NegativeNumberException {
		String inputString = "2\n3,7,2\n5,1,1002";
		int expected = 20;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void delimeterWithMultiCharactersTest() throws NegativeNumberException {
		String inputString = "//[***]\n1***2***3";
		int expected = 6;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}
	@Test
	public void multipleDelimetesrWithSingleCharacterTest() throws NegativeNumberException {
		String inputString = "//[*][%]\n1*2%3";
		int expected = 6;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}

	@Test
	public void multipleDelimetesrWithMultipleCharactersTest() throws NegativeNumberException {
		String inputString = "//[**][%%]\n1**2%%3";
		int expected = 6;
		int actual = sc.Add(inputString);
		assertEquals(expected, actual);
	}
}
