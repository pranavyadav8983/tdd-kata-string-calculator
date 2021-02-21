package com.stringcalculator.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static int count = 0;

	public int Add(String numbers) throws NegativeNumberException {
		count++;
		int sum = 0;
		String delimeter = "";
		List<Integer> negativeNumbers = null;
		StringBuilder sb = new StringBuilder();
		sb.append(",|\\n");

		if (numbers.contains("//")) {
			int end = 3;
			Pattern pattern = Pattern.compile("\\[(.*?)\\]");
			Matcher matcher = pattern.matcher(numbers);
			if (!matcher.find()) {
				sb.append("|");
				sb.append(numbers.charAt(2));
			}
			matcher.reset();
			while (matcher.find()) {
				sb.append("|");
				char arr[] = matcher.group(1).toCharArray();
				for (char c : arr) {
					sb.append("\\");
					sb.append(c);
				}
				end = matcher.end();
			}

			numbers = numbers.substring(end, numbers.length());
		}
		delimeter = sb.toString();
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
