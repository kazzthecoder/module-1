package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void when_given_String_return_everyOther_letter() {
        StringBits stringBits = new StringBits();
        String word = "Mississippi";
        String expectedWord = "Msispi";
        String actual = stringBits.getBits(word);
        Assert.assertEquals("Does not return new string containing every other letter  starting with the first", expectedWord, actual );
    }
    @Test
    public void when_given_string_length_1() {
        StringBits stringBits = new StringBits();
        String word = "I";
        String expectedWord = "I";
        String actual = stringBits.getBits(word);
        Assert.assertEquals("Does not return new string containing single letter", expectedWord, actual );
    }
}
