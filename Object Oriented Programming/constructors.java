public class constructors {
    public static void main(String[] args) {
        Per p1 = new Per();
        p1.age =21 ;
        p1.name="rahul";
        
        Per p2 = new Per(21, "Rahul sharma");
        // p2.age =19 ;
        // p2.name="neha";

        
    p1.eat();
    p2.walk();
    p2.walk(2);
    System.out.println(Per.c);
    }
}

class Per{
    String name;
    int age;
    // keyword
    static int c=0;

    public Per(){
        c++;
        System.out.println("creating an object");
    }
public Per(int age, String name){
    // This keyword
    // constructor call another constructor
    this();
    this.name= name;
    this.age=age;
}

    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");

    }

    void walk(int steps){
        System.out.println(name +" walked " + steps);
    }
}