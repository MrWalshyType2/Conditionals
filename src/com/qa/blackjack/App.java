package com.qa.blackjack;

public class App {
	public static int play(int num1, int num2) {
		if (num1 > 21 && num2 > 21) {
			return 0;
		} else if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(play(10, 21));
		play(20, 18);
		play(1, 22);
		System.out.println(play(22, 23));
	}
}
