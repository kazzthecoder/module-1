package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What was the total bill?");
		double totalBill = Double.parseDouble(scanner.nextLine());
		System.out.println("What was the amount tendered?");
		double amountTendered = Double.parseDouble(scanner.nextLine());
		System.out.printf("Total bill was %.2f, the change is %.2f", totalBill, amountTendered - totalBill);




	}

}
