package ConditionalStatements;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        if(sales > quota){
            salary = salary + bonus;
        }

        System.out.println("The employee's pay is " + salary);
    }
}
