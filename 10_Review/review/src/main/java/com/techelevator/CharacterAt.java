package com.techelevator;

public class CharacterAt {
    public static void main(String[] args) {
        String myString = "Hello World";
        for ( int i = 0; i < myString.length(); i++) {
            char character = myString.charAt(i);
            System.out.println(character);
        }
    }
}
