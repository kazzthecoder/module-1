package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {


    @Test
    public void when_given_array_of_strings_with_length_greater_than_1() {
        WordCount wordCount = new WordCount();
        String[] phrase = new String[]{"ba", "ba", "black", "sheep"};

        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("ba", 2);
        expectedMap.put("black", 1);
        expectedMap.put("sheep", 1);

        Map<String, Integer> actual = wordCount.getCount(phrase);

        Assert.assertEquals("Should return new map with word as key and times it appears as value ", expectedMap, actual);
    }
    @Test
    public void when_given_array_of_strings_with_length_1() {
        WordCount wordCount = new WordCount();
        String[] phrase = new String[]{"a", "b", "a", "c", "b"};

        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("a", 2);
        expectedMap.put("b", 2);
        expectedMap.put("c", 1);

        Map<String, Integer> actual = wordCount.getCount(phrase);

        Assert.assertEquals("Should return new map with word as key and times it appears as value ", expectedMap, actual);
    }

}
