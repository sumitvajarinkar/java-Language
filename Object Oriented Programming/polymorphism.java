// Classes and objects
//only public class with same name of file

public class polymorphism {
    public static void main(String[] args) {
        // System.out.println("Object oriented programming in JAVA");

        Pers p1 = new Pers();
        p1.age =21 ;
        p1.name="rahul";
        
        Pers p2 = new Pers();
        p2.age =19 ;
        p2.name="neha";

        
    p1.eat();
    p2.walk();
    p2.walk(2);
    }
}

class Pers{
    String name;
    int age;

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