package com.techelevator;
import java.util.Scanner;

public class TempConvert {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the temperature:");
		double temperature = Double.parseDouble(scanner.nextLine());
		double convertedTemperature = 0.0;
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String tempType = (scanner.nextLine());
		String oppoTempType = "";
		if (tempType.equalsIgnoreCase("F")) {
			convertedTemperature = (temperature - 32) / 1.8;
			tempType = "F";
			oppoTempType = "C";
		} else if (tempType.equalsIgnoreCase("C")) {
			convertedTemperature = (temperature * 1.8) + 32;
			tempType = "C";
			oppoTempType = "F";
		}
		System.out.printf("%.0f%s is %.0f%s",temperature, tempType, convertedTemperature, oppoTempType );
	}
}





