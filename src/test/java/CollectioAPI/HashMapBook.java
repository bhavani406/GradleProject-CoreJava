package CollectioAPI;

import java.util.HashMap;
import java.util.Map;

class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashMapBook {
    public static void main(String[] args) {
        Map<Integer,Book> books =  new HashMap<>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        books.put(1,b1);
        books.put(2,b2);
        books.put(3,b3);
        for(Map.Entry<Integer,Book> entry : books.entrySet()){
            int key = entry.getKey();
            Book book = entry.getValue();
            System.out.println(key +" "+"values" );
            System.out.println(book.id +" "+book.name +" "+book.author +" "+book.publisher +" "+book.quantity);
        }

    }
}
