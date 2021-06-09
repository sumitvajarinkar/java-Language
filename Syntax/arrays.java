import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        //array

        // int marks[]=new int[5];
        // marks[0] =23;
        // marks[1] =32;
        // marks[2] =24;
        // marks[3] =12;
        // marks[4] =10;
        
        // int marks[]={1,2,3,34,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<marks.length;i++){
            
            marks[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<marks.length;i++){

            System.out.println(marks[i]);
        }
        
    }
}
