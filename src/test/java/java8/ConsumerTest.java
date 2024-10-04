package java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> cons = System.out::println;//x->syso(x);
        Consumer<Integer> con = System.out::println;//x->syso(x);
        cons.accept("Hello");
        getText(()->"hai this is bhanu");
        List<Integer> list1 = List.of(12,14,16,18);
        con.accept(10);
        list1.forEach(con);
        forEach(list1, con);

    }

    public static void getText(Supplier<String> text){

        System.out.println(text.get());
    }
    static <T> void forEach(List<T> list, Consumer<T> consumer) {// T is the type argument(String,Integer) generic  decides by compiler when we use it
        for (T t : list) {
            consumer.accept(t);
        }


   }
}
