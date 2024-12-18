package Repetation;

import java.util.Scanner;

public class GrossPayValidator {
    public static void main(String[] args) {

        int payRate = 15;
        int maxHours = 40;

        System.out.println("How many hours did the employee work did this week?");
        Scanner scan = new Scanner(System.in);
        double hoursWorked = scan.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Enter the valid input");
            hoursWorked = scan.nextDouble();
        }
        //  if you are using a variable inside a loop then make sure it's checked in
        //  condition or else it will execute infinite times

        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: " + gross);
        
    }
}
