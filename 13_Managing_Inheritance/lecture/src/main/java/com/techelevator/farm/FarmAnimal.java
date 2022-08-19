package com.techelevator.farm;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping = false;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public String getSound( ) {
		if(isSleeping) {
			return "Zzzzz";
		}
		return sound;
	}

	public void sleep() {
		isSleeping = true;
	}

}