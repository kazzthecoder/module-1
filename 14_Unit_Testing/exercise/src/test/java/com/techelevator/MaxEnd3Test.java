package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    @Test
    public void when_given_array_with_largest_number_atEnd() {
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] numbersArray = new int[]{4,7,5};
        int[] expectedResult = new int[]{5,5,5};
        int[] actual = maxEnd3.makeArray(numbersArray);
        Assert.assertArrayEquals("Does not return array with elemnets equal to largest number at front or end", expectedResult, actual );
    }

    @Test
    public void when_given_array_with_largest_number_atStart() {
        MaxEnd3 maxEnd3 = new MaxEnd3();
        int[] numbersArray = new int[]{9,7,5};
        int[] expectedResult = new int[]{9,9,9};
        int[] actual = maxEnd3.makeArray(numbersArray);
        Assert.assertArrayEquals("Does not return array with elemnets equal to largest number at front or end", expectedResult, actual );
    }


}
