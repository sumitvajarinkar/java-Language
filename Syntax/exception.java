public class exception {
    public static void main(String[] anything) {

        //Exception handling 

        int a[] = new int[3];
        try{
            System.out.println(a[4]);
            
            //This below line can catch any exception 
            // }catch(Exception e){ 
                
                //we can catch many exception as below
                
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error occured !");
                System.out.println(e.getLocalizedMessage());
            } 
            try{
                System.out.println(2/0);
                
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Program running");
    }
}

/*
Error occured !
/ by zero
Program running
*/
