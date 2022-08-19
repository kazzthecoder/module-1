package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the fully qualified name of the file that should be searched?\n");
        String filePath = scanner.nextLine();
        System.out.println("What is the search word you are looking for?");
        String word = scanner.nextLine();
        System.out.println("Should the search be case sensitive? (Y/N)");
        String caseSensitive = scanner.nextLine();
        if (caseSensitive.equalsIgnoreCase("Y")) {
            File dataFile = new File(filePath);
            try (Scanner dataInput = new Scanner(dataFile)) {
                int currentLineNumber = 1;
                while (dataInput.hasNextLine()) {
                    String currentLine = dataInput.nextLine();
                    if (currentLine.contains(word)) {
                        System.out.println(currentLineNumber + ") " + currentLine);
                    }
                    currentLineNumber++;
                }
            } catch (FileNotFoundException fnf) {
                System.out.println("The file does not exist.");
            }
        } else if (caseSensitive.equalsIgnoreCase("N")) {
            File dataFile = new File(filePath);
            word = word.toLowerCase();
            try (Scanner dataInput = new Scanner(dataFile)) {
                int currentLineNumber = 1;
                while (dataInput.hasNextLine()) {
                    String currentLine = dataInput.nextLine();
                    String lowerLine = currentLine.toLowerCase();
                    if (lowerLine.contains(word)) {
                        System.out.println(currentLineNumber + ") " + currentLine);
                    }
                    currentLineNumber++;
                }
            } catch (FileNotFoundException fnf) {
                System.out.println("The file does not exist.");
            }





















        }
    }


}



