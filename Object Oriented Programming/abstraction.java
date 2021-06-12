package basics;

public class abstraction {
    public static void main(String[] args) {
        // Abstraction not for security it is for reducing complexities

       audi a1= new audi();
       a1.start();
       thar t1= new thar();
       t1.start();

    }
    
}

class audi extends Car{
    @Override
    void start(){
        System.out.println("Audi starts");
    }
}
class thar extends Car{
    @Override
    void start(){
        System.out.println("Thar starts");
    }
    
}

abstract class Car{
    int price;
    abstract void start();

    // void breaks(){
    //     System.out.println("Car is breaking");
    // }
}