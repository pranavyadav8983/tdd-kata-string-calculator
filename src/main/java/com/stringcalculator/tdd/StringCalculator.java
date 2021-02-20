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
		if(stringArray.length==2) {
			return Integer.parseInt(stringArray[0])+Integer.parseInt(stringArray[1]);
		}
		return 1;
	}
	
}
