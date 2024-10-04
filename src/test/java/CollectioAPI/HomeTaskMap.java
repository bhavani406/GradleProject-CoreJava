package CollectioAPI;

import java.util.*;

public class HomeTaskMap {

        public static void main(String[] args) {
            Map<String,String> phoneBook= new HashMap<>();
            Scanner inputScanner= new Scanner(System.in);
            System.out.println("Enter number of entries");
            int numberOfEntries = inputScanner.nextInt();
            for(int i=0;i<numberOfEntries;i++) { // Number of entries
//                String entryName= inputScanner.next();
//                String entryPhoneNumber=inputScanner.next();
                phoneBook.put(inputScanner.next(), inputScanner.next());
            }
            List<String> searchNames = new ArrayList<>(); // List of contacts For search operation
            for (int i=0; i<2;i++) {
                searchNames.add(inputScanner.next());
            }
            for(String name: searchNames) {
                if (phoneBook.containsKey(name)) {
                    System.out.println(name + "-" + phoneBook.get(name));
                } else {
                    System.out.println("not found");
                }

            }
            inputScanner.close();
            /*
             * while(true) { String name=inputScanner.nextLine();
             * if(phoneBook.containsKey(name)) { System.out.println(name+" "+
             * phoneBook.get(name)); }else{ System.out.println("not found"); break; }
             *
             * }
             */



        }
    }

