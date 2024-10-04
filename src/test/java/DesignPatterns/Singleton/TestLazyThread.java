package DesignPatterns.Singleton;

public class TestLazyThread {

    public static void main(String[] args) {
        Runnable task=()->{
            SingletonLazy.getInstance().displayMsg();
        };

        Thread thread1 =  new Thread(task);
        Thread thread2 =  new Thread(task);
        Thread thread3 =  new Thread(task);
        Thread thread4 =  new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //wait for all threads to complete
        try{
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }
        catch(InterruptedException e){
         e.printStackTrace();
        }
    }
}
