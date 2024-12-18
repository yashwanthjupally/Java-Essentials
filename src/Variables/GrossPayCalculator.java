package Variables;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1. Get the number of hours worked
        int hours;
        System.out.println("How many hours did you work? ");
        hours = scan.nextInt();

        //2. Get the hourly pay rates
        double payRate;
        System.out.println("What is your pay rate? ");
        payRate = scan.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. print the result
        System.out.println("Gross pay: " + grossPay);

    }
}
