package com.stringcalculator.tdd;

public class StringCalculator {
	public int Add(String numbers) {
		int sum = 0;
		String stringArray[] = numbers.split(",");
		if (numbers.isEmpty()) {
			sum = 0;
		} else {
			for (String number : stringArray) {
				sum = sum + Integer.parseInt(number);
			}
		}
		return sum;
	}

}
