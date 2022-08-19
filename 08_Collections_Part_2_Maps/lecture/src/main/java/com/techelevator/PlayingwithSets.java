package com.techelevator;
import java.util.HashSet;
import java.util.Set;


public class PlayingwithSets {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        System.out.println(mySet.add(4));
        for(int value: myset) {
            System.out.println(value);
        }

        mySet.remove(4);
        for (Integer value : mySet) {
            System.out.println(value);
        }

    }

}
