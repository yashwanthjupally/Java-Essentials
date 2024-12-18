package ConditionalStatements;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args) {

        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }else{
            int salesShort = quota - sales;
            System.out.println("You were short of " +salesShort);
        }
    }
}
