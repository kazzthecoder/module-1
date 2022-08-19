package com.techelevator;

public class LastTwo {

    public static int last2(String str) {

        int counter = 0;
        if (str.length() <= 3 || str == null) {
            return counter;
        }
        String lastTwo = str.substring(str.length() - 2, str.length());
        for (int i = 0; i < str.length() - 2; i++) {
            String checkString = str.substring(i, i + 2);
            if (checkString.contains(lastTwo)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(LastTwo.last2(null));
    }

}


