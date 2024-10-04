package CollectioAPI;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("adhi");
        list.add("banu");
        list.add("arnika");
        list.add("abhay");

        for(String s: list){
            System.out.println(s);
        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list.get(0));

    }
}
