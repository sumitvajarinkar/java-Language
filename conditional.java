
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {

        // >, <, >=, <=, ==, != 

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if(age > 18){
            System.out.println("You can vote!");
        }
        else{
            
            System.out.println("You cannot vote!");
        }

        if(19 > 18){
            System.out.println("19 is greater");
        }
        Scanner c =new Scanner(System.in);
        char grade = c.next().charAt(0);
        c.close();

        if(grade=='A'){
            System.out.println("+90 has A grade");
        }
        else if(grade=='B'){
            System.out.println("+70 has B grade");
        }
        else if(grade=='C'){
            System.out.println("+50 has C grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
