import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("Enter grade char:");
        Scanner c = new Scanner(System.in);
        char grade=c.next().charAt(0);
        c.close();
        switch (grade) {
            case 'A':
                System.out.println("+90 has A grade");
                break;
            case 'B':
                System.out.println("+80 has B grade");
                break;
            case 'C':
                System.out.println("+50 has C grade");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
