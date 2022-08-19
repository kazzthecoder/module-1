package com.techelevator;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int userInput = Integer.parseInt(scanner.nextLine());
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber = firstNumber + secondNumber;
		if (userInput <= 0) {
			System.out.print(firstNumber + ", " + secondNumber);
		} else if (userInput == 1) {
			System.out.printf(firstNumber + ", " + secondNumber + ", " + thirdNumber);
		} else if (userInput > 1) {
			for (int i = 0; userInput >= (firstNumber); i++) {
				System.out.print(firstNumber + ", ");
				thirdNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = thirdNumber;
			}
		}
	}
}



