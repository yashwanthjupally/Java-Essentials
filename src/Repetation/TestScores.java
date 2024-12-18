package Repetation;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        int numberOfStudents = 20;
        int numberOfTests = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for Test " + (j+1));
                double score = scanner.nextDouble();
                total = total+score;
            }
            double average = total / numberOfTests;
            System.out.println("The test average for student " + (i+1) + " is " + average);
        }
    }
}
