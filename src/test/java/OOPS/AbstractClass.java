package OOPS;

public abstract class AbstractClass {

    abstract void sound();

    void print(){

    }

}

class Car extends AbstractClass{

    public static void main(String[] args) {
        Car c = new Car();
        c.sound();
    }

    void sound() {
        System.out.println("hello");
    }
}
