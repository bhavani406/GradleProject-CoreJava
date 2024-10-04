package CoreJava;

import java.util.Arrays;

enum Status {  // class by default running,jum..all are objects
     RUNNING,JUMPING,WALKING;  // SO INSTEAD OF SENDING CREATING METHOD AND PASSING TO OTHER CLASS
     // CAN HAVE CONSTANTS LIKE THIS

}
enum Laptop{
    MAC(1000),LENOVO(2000),DELL();  //will create a constructior to refer price
    private int price;
    private Laptop(){
        price= 500;
    }
    private Laptop(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }

}
class EnumTest{
    public static void main(String[] args) {
        Status s = Status.RUNNING;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] s1 = Status.values(); // calling Enum class methods
        Arrays.stream(s1).forEach(System.out::println);
        Laptop l = Laptop.MAC;
        //System.out.println(l.getPrice());
        Laptop[] lap = Laptop.values();
        Arrays.stream(lap).forEach(System.out::println);
        for(Laptop lappy:lap){
            System.out.println(lappy +":" +lappy.getPrice());
        }



        //switch
        switch (s) {
            case RUNNING:
                System.out.println("running");
                break;
            case JUMPING:
                System.out.println("jumping");
                break;
            case WALKING:
                System.out.println("walking");
                break;
            default:
                System.out.println("stand");

        }
    }
}
