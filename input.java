import java.util.Scanner;
// require port to take user input
public class input {
    public static void main(String[] args) {
        System.out.println("hello");

        // object variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age\n");
        
        // int
        int age =sc.nextInt();        
        System.out.println(age);
        
        // float
        float age1 =sc.nextFloat();
        System.out.println(age1);
        
        // string
        String name=sc.nextLine();
        System.out.println(name);

        // Char
        char grade = sc.next().charAt(0);
        System.out.println(grade);

        sc.close();
    }
}
