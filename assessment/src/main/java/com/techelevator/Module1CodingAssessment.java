package com.techelevator;

import java.time.Year;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mustang = new Car(1965,"Ford Mustang" ,true);
		Car subaru = new Car(2019,"Subaru",false);
		Car baker = new Car(1920,"Baker Electric",true);
		Car gto = new Car(1970,"Pontiac GTO",true);
		Car camry = new Car(2018,"Toyota Camry",false);
		int year = Year.now().getValue();
		System.out.println(camry.receiveECheck(2028));
		System.out.println(year);
		System.out.println(camry.toString());



	}

}
