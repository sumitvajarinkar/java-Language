package basics;

public class interfaces implements Car{
    public static void main(String[] args) {

        //interface including methods are by default public abstart  
    }

    // JAVA avoid multiple inheritance
    // 

    @Override
    public void start() {
        System.out.println("My car start");
        
    }
}

interface Car{
    void start();
}
