package encapsulation;
public class encapsule {
    public static void main(String[] args) {
        // encapsule obj = new encapsule();
        // obj.doWork();

        Laptop l1 = new Laptop();
        l1.setPrice(21);
        System.out.println(l1.getPrice());
    }
    // public void doWork(){
    //     System.out.println("Available");
    // }
}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        // boolean isAdmin=false; //set price to 0
        boolean isAdmin=true;  //set price from object
        if(!isAdmin){
            System.out.println("Cannot set price");
        }
        else{
            this.price=price;
        }
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getPrice(){
        return price;
    }
}
