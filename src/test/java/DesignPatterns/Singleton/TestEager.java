package DesignPatterns.Singleton;

public class TestEager {
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1.hashCode());
        System.out.println(singletonEager2.hashCode());
    }
}
