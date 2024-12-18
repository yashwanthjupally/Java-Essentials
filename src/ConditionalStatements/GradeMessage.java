package ConditionalStatements;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your grade:");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        scan.close();

        String message;
        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh Oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

//  Enhanced Switch statements aka Switch expressions
        message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh Oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
