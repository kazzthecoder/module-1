package com.techelevator;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal values (separated by spaces):");
		String userInputs = scanner.nextLine();

		String[] numbersArrayString = userInputs.split(" ");
		int[] numbersArrayInt = new int[numbersArrayString.length];
		for (int i = 0; i < numbersArrayString.length; i++) {
			numbersArrayInt[i] = Integer.parseInt(numbersArrayString[i]);
		}
		for (int j = 0; j < numbersArrayInt.length; j++) {
			int n = numbersArrayInt[j];

			// array to store binary number
			int[] binaryNum = new int[1000];

			// counter for binary array
			int i = 0;
			while (n > 0)
			{
				// storing remainder in binary array
				binaryNum[i] = n % 2;
				n = n / 2;
				i++;
			}
			System.out.println("\n" + numbersArrayInt[j] + " in binary is ");


			// printing binary array in reverse order
			for (int k = i - 1; k >= 0; k--)
				System.out.print(binaryNum[k]);
		}


		}
	}






