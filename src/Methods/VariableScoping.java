package Methods;

public class VariableScoping {

    static String myVariable = "abc";

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        System.out.println("global: " + myVariable);
        String myVariable = "def";  //made a local variable works only in this method
        System.out.println("local: " + myVariable);
    }

    //  The static keyword is a non-access modifier
}
