package Objects;

// A class is a blueprint (set of rules we can use it by calling many objects)

public class Rectangle {
    private double length;
    private double breadth;

    public double calculatePerimeter(){
        return 2 * (length + breadth);
    }

    public double calculateArea(){
        return length * breadth;
    }

    // public: Any class can access, use or refer
    // private: Only current class can access, use or refer
    // use of these two can make our class Encapsulated(Binding of data,
    //  -only shown req amount)

    //    we can use this class by creating values in it. There are many ways to create values
    //   1 way is getters and setters



    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setBreadth(double breadth){
        this.breadth = breadth;
    }


    //   2 way is using constructor

    public Rectangle(){     // default constructor (NoArg)

    }

    public Rectangle(double length, double breadth){    // AllArg constructor
        setLength(length);
        setBreadth(breadth);
    }
}
