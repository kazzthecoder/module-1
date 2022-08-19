package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AnimalGroupNameTest {

    AnimalGroupName animals;


    @Before
    public void setup() {
         animals = new AnimalGroupName();
    }


    @Test
    public void when_given_mappedAnimal_in_lowerCase() {
        // arrange
        Map<String, String> animalsTest = new HashMap<>();
        String animalName = "rhino";
        String animalGroup = "Crash";
        animalsTest.put(animalName, animalGroup);
        String animalGroupTest = animalsTest.get(animalName.toLowerCase());
        // act
        String actual = animals.getHerd(animalName);
        // assert
        Assert.assertEquals("If animal located in AnimalGroupName and given in lowercase return groupName ",animalGroupTest, actual);
    }
    @Test
    public void when_given_mappedAnimal_in_upperCase() {
        // arrange
        Map<String, String> animalsTest = new HashMap<>();
        String animalName = "RHINO";
        String animalGroup = "Crash";
        animalsTest.put(animalName.toLowerCase(), animalGroup);
        String animalGroupTest = animalsTest.get(animalName.toLowerCase());
        // act
        String actual = animals.getHerd(animalName);
        // assert
        Assert.assertEquals("If animal located in AnimalGroupName and given in uppercase return groupName ",animalGroupTest, actual);
    }

    @Test
    public void when_given_animal_not_mapped_in_AnimalGroupName() {
        // arrange
        String animalGroupTest = "unknown";
        String unknownAnimal = "Pelican";
        // act
        String actual = animals.getHerd(unknownAnimal);
        // assert
        Assert.assertEquals("If animal not located in AnimalGroupName return unknown","unknown", actual);
    }



}
