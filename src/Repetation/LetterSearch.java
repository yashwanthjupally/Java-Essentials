package Repetation;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {

        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        boolean letterFound = false;

        for (int i = 0; i < text.length(); i++) {
            char currLetter = text.charAt(i);
            if(currLetter == 'A' || currLetter == 'a'){
                letterFound = true;
                System.out.println("index: " + i);
                break;
            }
        }
    }
}
