package com.stringcalculator.tdd;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	public static int count = 0;

	public int Add(String numbers) throws NegativeNumberException {
		count++;
		int sum = 0;
		String delimeter = ",|\n";
		List<Integer> negativeNumbers = null;

		if (numbers.contains("//")) {
			delimeter = "\\" + numbers.substring(2, 3) + "|" + delimeter;
			numbers = numbers.substring(3, numbers.length());
		}

		String stringArray[] = numbers.split(delimeter);
		if (numbers.isEmpty()) {
			sum = 0;
		} else {
			negativeNumbers = new ArrayList();
			for (String number : stringArray) {
				if (!number.isEmpty()) {
					int num = Integer.parseInt(number);
					sum = num < 1000 ? (sum + num) : sum;
					if (num < 0) {
						negativeNumbers.add(num);
					}
				}
			}
		}
		if (negativeNumbers != null && !negativeNumbers.isEmpty()) {
			throw new NegativeNumberException("negatives not allowed." + negativeNumbers);
		}
		return sum;
	}

	public int GetCalledCount() {
		return count;
	}

}
