package Objects;

//Object, It's an instance of class where we use class properties in our code by
    // instantiating or calling them

public class HomeArea {

    public static void main(String[] args) {

        //class object = calling class to use it by constructor
        // here default constructor
        Rectangle room1 = new Rectangle();

        // we can use the class properties by '. operator'
        room1.setLength(20);
        room1.setBreadth(40);

        double area1 = room1.calculateArea();

        // here AllArgs constructor
        Rectangle room2 = new Rectangle(30, 60);
        double area2 = room2.calculateArea();

        System.out.println(area1);
        System.out.println(area2);


        //real use case
        Rectangle kitchen = new Rectangle(300, 600);
        Rectangle bathroom = new Rectangle(200, 200);

        System.out.println(calculateArea(kitchen, bathroom));
    }

    // we can use classes in our method parameters similar to variables
    public static double calculateArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

}
