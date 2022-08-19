package com.techelevator;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate mybirthday = LocalDate.of(2000, 2, 28);

        System.out.println(today.isAfter(mybirthday));
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        System.out.println(today.format(DateTimeFormatter.ISO_DATE));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyyMMdd")));

    }
}
