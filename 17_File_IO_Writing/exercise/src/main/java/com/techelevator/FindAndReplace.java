package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the search word?");
        String searchWord = userInput.nextLine();
        System.out.println("What is the search word?");
        String replacementWord = userInput.nextLine();
        System.out.println("What is the name of the source file?");
        String sourceFile = userInput.nextLine();
        System.out.println("What is the destination file?");
        String destinationFinal = userInput.nextLine();

        File inputFile = new File(sourceFile);
        try (Scanner dataInput = new Scanner(inputFile);
             PrintWriter dataOutput = new PrintWriter(destinationFinal)
        ) {
            while (dataInput.hasNextLine()) {
                String lineOfInput = dataInput.nextLine();
                String newLine = lineOfInput.replace(searchWord, replacementWord);
                dataOutput.println(newLine);
            }

        } catch (FileNotFoundException fnf) {
            System.out.println("File does not exist.");

        }

    }
}
