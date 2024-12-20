package Objects;

import java.util.Scanner;

public class HomeArea2 {

    //Taking user input
    public static void main(String[] args) {

        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        double area = area(kitchen, bathroom);
        System.out.println(area);

    }

    public static double area(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of your room: ");
        double breadth = scanner.nextDouble();

        return new Rectangle(length, breadth);
    }
}
