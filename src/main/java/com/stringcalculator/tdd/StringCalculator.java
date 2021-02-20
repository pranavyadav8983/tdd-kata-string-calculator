package com.stringcalculator.tdd;

public class StringCalculator {
	public int Add(String numbers) {
		String stringArray[]=numbers.split(",");
		if(numbers.isEmpty()) {
			return 0;
		}
		if(stringArray.length==1) {
			return Integer.parseInt(stringArray[0]);
		}
		return 1;
	}
	
}
