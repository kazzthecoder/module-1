package com.techelevator;

import java.util.Scanner;

public class LinearConvert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		double length = Double.parseDouble(scanner.nextLine());
		double convertedLength = 0;
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String lengthType = scanner.nextLine();
		String oppoLengthType = "";
		if(lengthType.equalsIgnoreCase("f")); {
			convertedLength = length * 0.3048;
			lengthType = "f";
			oppoLengthType = "m";
		} if (lengthType.equalsIgnoreCase("m")) {
			convertedLength = length * 3.2808399;
			lengthType = "m";
			oppoLengthType = "f";
		}
		System.out.printf("%.2f%s is %.2f%s", length, lengthType, convertedLength, oppoLengthType );


	}
	}



