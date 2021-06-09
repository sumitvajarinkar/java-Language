import java.util.Scanner;
public class logicalOperators {
    public static void main() {
        
        // && logical and, || logical or, ! logical not  

        Scanner c = new Scanner(System.in);
        char grade=c.next().charAt(0);
        c.close();
        if(grade=='A' && grade=='B'){
            System.out.println("+90 %");
        }
        else if(grade=='C' || grade =='D'){
            System.out.println("+70 %");
        }
        else if(grade!='D'){
            System.out.println("+50 %");
        }
        else{
            System.out.println("Fail");
        }

    }
}
