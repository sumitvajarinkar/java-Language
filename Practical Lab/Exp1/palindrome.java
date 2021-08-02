import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rem = 0, temp, sum = 0;
        System.out.println("Enter any number");
        n = sc.nextInt();
        sc.close();
        temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is palindrome.");
        } else {
            System.out.println(temp + " is not palindrome.");
        }
    }
}
