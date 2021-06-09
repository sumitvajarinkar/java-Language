// import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        // Loops
        //For, while, do-while

        // for loop 
        // for(int i=0;i<10;i++){
        //     System.out.println("Sumit");
        // }

        //while
        int a=1;
        while(a<23){
            a++;
            if(a==15)
            {
                continue; //it skip next one iteration
            }
            System.out.println(a);
        }

        // do while - runs atleast once
        // int a1=1;
        // do {
        //         System.out.println(a1);
        //         a1++;
        // } while (a1>100);
    }
}
