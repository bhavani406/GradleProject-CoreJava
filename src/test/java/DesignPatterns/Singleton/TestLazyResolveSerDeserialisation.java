package DesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestLazyResolveSerDeserialisation {
    public static void main(String[] args) {
        SingletonLazy singletonLazy =  SingletonLazy.getInstance();

        try{

            //SERIALIZE THE BROWSER INSTANCE
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("browser.json"));
            objectOutputStream.writeObject(singletonLazy);
            objectOutputStream.close();

            //DESERIALIZATION TO JAVA POJO OBJECT
            ObjectInputStream objectInputStream=  new ObjectInputStream(new FileInputStream("browser.json"));
            SingletonLazy singletonLazy1 = (SingletonLazy) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println("hashcode1" +" "  +singletonLazy.hashCode()); // hascode will differ for both
            //  so inorder to avoid will create a method in singleton class which will return instance
            //which will be called in DESERIALIZATION
            System.out.println("hashcode2" +" "  +singletonLazy1.hashCode());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
