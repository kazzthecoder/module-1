package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void when_given_array_with_same_first_and_last_integers() {
       SameFirstLast sameFirstLast = new SameFirstLast();
        int[] numbersArray = new int[]{4,7,5,6,3,67,23,4};
        boolean expectedResult = true;
        boolean actual = sameFirstLast.isItTheSame(numbersArray);
        Assert.assertEquals("Does not return true when first and last elements in array are equal", expectedResult, actual );
    }

    @Test
    public void when_given_array_with_different_first_and_last_integers() {
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] numbersArray = new int[]{6,3,67,23,4,19};
        boolean expectedResult = false;
        boolean actual = sameFirstLast.isItTheSame(numbersArray);
        Assert.assertEquals("Does not return false when first and last integers in array are not equal", expectedResult, actual );
    }

    @Test
    public void when_given_empty_array() {
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] numbersArray = new int[0];
        boolean expectedResult = false;
        boolean actual = sameFirstLast.isItTheSame(numbersArray);
        Assert.assertEquals("Does not return flase when given empty array", expectedResult, actual );
    }
}
