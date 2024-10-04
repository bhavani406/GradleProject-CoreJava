package java8;

import java.util.*;
import java.util.function.Function;

public class FunctionalInterf {
    public static void main(String[] args) {
        List<String> list = List.of("app","bha","car");
        Function<String,Integer> func3 = String::length;
        //Function<String,Integer> func3 = x->x.length();
        Function<Integer,Integer> func1 = x->2*x; // 2*4 = 8 now x=8-> 8*8=64
        Function<Integer,Integer> fun2 = x->x*x;
        System.out.println(func1.andThen(fun2).apply(4));
        System.out.println(func1.compose(fun2).apply(4));
        //System.out.println(func.apply("bhavani"));
        Map<String,Integer> mapl = convertListToMap(list,func3);
        mapl.entrySet().forEach(System.out::println);

    }
     private static<T,R> Map<T,R> convertListToMap(List<T> list, Function<T,R> fun){
        Map<T,R> result = new HashMap<>();
        for(T t: list){
            result.put(t,fun.apply(t));
        }
        return result;
     }

}
