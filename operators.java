public class operators {
    public static void main(String[] args) {
        //  +,-,*,/,%,++,--
        int firstNumber = 12;
        int secondNumber = 5;

        int sum = firstNumber + secondNumber;
        System.out.println(sum);

        int sub = firstNumber - secondNumber;
        System.out.println(sub);

        int mul = firstNumber * secondNumber;
        System.out.println(mul);

        //typecast
        float div = (float)firstNumber / (float)secondNumber;
        System.out.println(div);

        int mod = firstNumber % secondNumber;
        System.out.println(mod);
        
        //++ , -- pre post
        System.out.println("++ / --");

        System.out.println(firstNumber++);
        System.out.println(firstNumber);

        System.out.println(secondNumber--);
        System.out.println(secondNumber);

        System.out.println(++firstNumber);
        System.out.println(firstNumber);

        System.out.println(--secondNumber);
        System.out.println(secondNumber);


        // Assignment operator =
        // == to comapare

        
    }
}
