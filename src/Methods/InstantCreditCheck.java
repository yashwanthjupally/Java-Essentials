package Methods;

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();

//        isUserQualified(creditScore, salary);

        boolean qualified = isUserQualified2(creditScore, salary);
        notifyUser(qualified);

    }

    public static void isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congrats! You've been approved");
        }
        else{
            System.out.println("Sorry, You've been declined");
        }
    }

    public static boolean isUserQualified2(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
           return true;
        }
        else{
           return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("yayy");
        }
        else{
            System.out.println("uhhh");
        }
    }
}
