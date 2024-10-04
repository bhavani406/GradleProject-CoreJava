package CollectioAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSetIterator {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"apple");
        map.put(106,"cat");
        map.put(102,"ball");
        map.put(110,"ele");
        Map<String, String> map1 = new HashMap<>();
        map1.put("Sumit",  "Singh");
        map1.put("Devesh", "Mishra");
        map1.put("Rahul", "Tiwari");
        for (String name: map1.keySet())         //iteration over keys
        {
//returns the value to which specified key is mapped
            String lastname=map1.get(name);
            System.out.println("Key: " + name + ", Value: " + lastname);
        }
        map1.forEach((k,v)-> System.out.println("key  " +k+"value  " +v));

    Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        //comparingByValue


    }
}
