// Classes and objects
//only public class with same name of file

public class classObjects {
    public static void main(String[] args) {
        // System.out.println("Object oriented programming in JAVA");

        Person p1 = new Person();
        p1.age =21 ;
        p1.name="rahul";
        
        Person p2 = new Person();
        p2.age =19 ;
        p2.name="neha";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        
    p1.eat();
    p2.walk();
    }
}

class Person{
    String name;
    int age;
    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");

    }
}