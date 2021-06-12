// import encapsulation.encapsule;

public class inheritance {
    public static void main(String[] args) {
        inherited i1 = new inherited(21, "Raj");
        i1.walk();
        i1.eat();
        //parent is in object
        //class and object parent in object 

        //public in encapsulation
        // encapsule obj = new encapsule();
        // obj.doWork();
    }
}

class inherited extends inherit{
    
    //create new constructor
    public inherited(int age, String name) {
        
        // super keyword call parent constructor
        super(age, name);
        
    }
    void walk(){
        System.out.println(name + " is coding.");
    }

}

class inherit{
    protected String name;
    int age;
    // keyword
    static int c=0;

public inherit(int age, String name){
    // This keyword
    // constructor call another constructor
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
