public class methods {

    public static void main(String[] kuchbhi) {
        
        System.out.println(avg(3,6));
        System.out.println(avg(4,6));
        System.out.println(avg(5,6));
    }
    //methods
    // returnType functionName (argumens){}
    
    static int avg(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum/2;
    }
}
