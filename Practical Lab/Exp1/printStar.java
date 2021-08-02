import java.util.Scanner;

public class printStar {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i, j, row;
        System.out.println("Enter a number of rows you want");
        row=sc.nextInt();
        sc.close();
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
