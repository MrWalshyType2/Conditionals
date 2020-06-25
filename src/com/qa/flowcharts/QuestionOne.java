package com.qa.flowcharts;

public class QuestionOne {
	public static int sumOrMultiply(int num1, int num2, boolean willSum) {
		int result = 0;
		
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			return 0;
		} else if (willSum) {
			result = num1 + num2;
		} else {
			result = num1 * num2;
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(sumOrMultiply(1, 2, true));
		System.out.println(sumOrMultiply(3, 3, false));
		System.out.println(sumOrMultiply(1, 1, true));
		System.out.println(sumOrMultiply(2, 2, true));
	}
}
