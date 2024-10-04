package DesignPatterns.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestLazyReflectionResolve {
    public static void main(String[] args) {
        SingletonLazy  instance =  SingletonLazy.getInstance();
        SingletonLazy instance1 = null;
        try{
            Constructor<SingletonLazy> constructor = SingletonLazy.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance1 = constructor.newInstance();
            System.out.println(instance.hashCode());
            System.out.println(instance1.hashCode());

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
