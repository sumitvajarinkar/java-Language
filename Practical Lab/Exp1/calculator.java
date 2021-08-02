import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true){
      System.out.println("This is calculator\nEnter any 2 numbers :");
      int a, b;
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println("Enter\n1 : Addtion\n2 : Substraction\n3 : Multiplication\n4 : Division");
      int operator = sc.nextInt();
      switch(operator) {
         case 1:
         System.out.println("Addition is " + (a + b));
         break;
         case 2:
         System.out.println("Substraction is " + (a - b));
         break;
         case 3:
         System.out.println("Multiplication is " + (a * b));
         break;
         case 4:
         System.out.println("Division is " + (a / b));
         break;
         case 5:
         break;
         default:
         System.out.println("Entered wrong choice !");
      }
   }
}
}

