import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ans = 1, temp;
        System.out.println("Enter any number :");
        n = sc.nextInt();
        sc.close();
        temp = n;
        while (n > 0) {
            ans *= n;
            n--;
        }
        System.out.println("Factorial of " + temp + " is " + ans);
    }
}
