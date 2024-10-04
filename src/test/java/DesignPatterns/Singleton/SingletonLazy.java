package DesignPatterns.Singleton;


import java.io.Serial;
import java.io.Serializable;

//Lazy initialization defers the creation of an object until it is needed.
// This is useful when the object is resource-heavy or might not be used in every run of the program.
// This approach can save memory and resources but often requires synchronization to ensure thread safety.
//double checking mechanism
public class SingletonLazy implements Serializable {

    private static volatile SingletonLazy instance = null;

    // TO AVOID REFLECTION ATTACK - using this we can access private constructor in class using
    //SingletonLazy.clas.getDeclaredConstructor()
    //con.newInstance();

    private SingletonLazy(){ // in order to avoid reflection attack
        if(instance!=null){
            throw new IllegalArgumentException("Object already exists");
        }
    }
    public static SingletonLazy getInstance(){
        if(instance==null){
            synchronized (SingletonLazy.class){ // if 1,2,3,4 threads access 1st it creates object later shared to 2,3,4
                // it is class level approach performance much better than applying on method
                if(instance==null){
                    instance =  new SingletonLazy();
                }
            }
        }
        return  instance;
    }
    public void displayMsg(){
        System.out.println("lazy intialization...");
    }

    // METHOD WHICH WILL CALL IN DESERIALIZATION PROCESS SAME OBJECT WILL BE RETURNED
    // IMPLIMENT SERIALIZABLE INTERFACE
    @Serial
    protected Object readResolve(){
        return  getInstance();
    }

}
