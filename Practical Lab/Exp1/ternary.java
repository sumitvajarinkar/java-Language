import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, max;
        System.out.println("Enter any 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        max = a > b ? a : b;
        System.out.println("Maximum is " + max);
        sc.close();
    }
}
