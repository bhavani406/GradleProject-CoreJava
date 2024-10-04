package DesignPatterns.Singleton;

// singleton objects created before using the client

public class SingletonEager {
    // private static variable instance
    // eager initialization creating object before class calling
    //This strategy initializes an object or resource as soon as the program starts or the class is loaded,
    // regardless of whether or not it will actually be used.
    // It ensures that the object is always ready for use, but it can waste resources if the object is never used.
    //Lazy initialization defers the creation of an object until it is needed.
// This is useful when the object is resource-heavy or might not be used in every run of the program.
// This approach can save memory and resources but often requires synchronization to ensure thread safety.
//double checking mechanism
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() { // private constructor

    }

    public static SingletonEager getInstance() { // static global method
        return INSTANCE;
    }
}

    //////////////////////////////////////////////////////////////////////////////////
    // static block intialization which also creates object when class loads
//    private static final SingletonEager INSTANCE = null;
//    private SingletonEager(){}
//    static{
//        if(INSTANCE==null){
//            INSTANCE =  new SingletonEager();
//        }else(Exception e){
//            e.printStackTrace();
//        }
//        public static SingletonEager getInstance(){ // static global method
//            return INSTANCE;


