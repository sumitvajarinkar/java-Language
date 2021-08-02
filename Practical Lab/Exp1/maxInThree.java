import java.util.Scanner;

public class maxInThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter any 3 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
        if(a>=b){
            if(a>=c){
                System.out.println(a+" is maximum number");
            }
            else{
                System.out.println(c+" is maximum number");
            }
        }
        else{
            if(b>=c){
                System.out.println(b+" is maximum number");
            }
            else{
            System.out.println(c+" is maximum number");
        }
    }
}
}
