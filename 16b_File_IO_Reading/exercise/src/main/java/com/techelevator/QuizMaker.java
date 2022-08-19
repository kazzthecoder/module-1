package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fully qualified name of the file to read in for quiz questions\n");
        String filepath = scanner.nextLine();
        File file = new File(filepath);
        int numberOfRightAnswers = 0;
        int numberOfQuestions = 0;
        try (Scanner dataInput = new Scanner(file)) {
            while (dataInput.hasNextLine()) {
                String questionsAndAnswers = dataInput.nextLine();
                String[] questionArray = questionsAndAnswers.split("\\|");
                int correctAnswer = 0;
                String question = questionArray[0];
                String answer1 = questionArray[1];
                String answer2 = questionArray[2];
                String answer3 = questionArray[3];
                String answer4 = questionArray[4];
                if (answer1.endsWith("*")) {
                    answer1 = answer1.substring(0, answer1.length() - 1);
                    correctAnswer = 1;
                }
                if (answer2.endsWith("*")) {
                    answer2 = answer2.substring(0, answer2.length() - 1);
                    correctAnswer = 2;
                }
                if (answer3.endsWith("*")) {
                    answer3 = answer3.substring(0, answer3.length() - 1);
                    correctAnswer = 3;
                }
                if (answer4.endsWith("*")) {
                    answer4 = answer4.substring(0, answer4.length() - 1);
                    correctAnswer = 4;
                }
                System.out.println(question);
                System.out.println("1) " + answer1);
                System.out.println("2) " + answer2);
                System.out.println("3) " + answer3);
                System.out.println("4) " + answer4);
                System.out.println("Please select the correct number of the answer\n");
                String guessString = scanner.nextLine();
                int guessNumber = Integer.parseInt(guessString);
                if (guessNumber == correctAnswer) {
                    System.out.println("RIGHT!");
                    numberOfRightAnswers++;
                    numberOfQuestions++;
                } else {
                    System.out.println("Sorry Incorrect...");
                    numberOfQuestions++;
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("The file does not exist.");

        }
        System.out.printf("You got %d answer(s) correct out of the %d questions asked.", numberOfRightAnswers, numberOfQuestions);
    }
}
