/**
 * 1. Local Variables: A variable defined within a block or method or
 * constructor is called local variable.
 * 
 * 2. Static Variables: Static variable in Java is variable which belongs to the
 * class and initialized only once at the start of the execution. It is a
 * variable which belongs to the class and not to object(instance).
 * 
 * 3.Instance Variables: Instance variables are non-static variables and are
 * declared in a class outside any method, constructor or block.
 **/

public class typesOfVariable {

    static int s = 100;// static variable
    int i = 50;// instance variable

    public static void main(String[] args) {
        typesOfVariable t = new typesOfVariable(); // object
        int l = 90;// local variable
        System.out.println("Static variable " + s);
        System.out.println("Local variable " + t.i);
        System.out.println("Instance variable " + l);
    }

}
