package CollectioAPI;

import java.util.*;

class Pet{
    int sno;
    String name;
    Pet(int sno, String name){
        this.sno = sno;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getSno() {
        return sno;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(new Pet(101,"snoopy"), new Pet(103,"doggy"), new Pet(110,"puppy"));
        Comparator<Pet> sortByName=(i,j)-> i.name.compareTo(j.name);
        Comparator<Pet> sortBySno = (i,j)-> i.getSno()>j.getSno()?1:-1;
        Collections.sort(pets,sortBySno.reversed());
//        for (Pet p:pets){
//            System.out.println(p);
//        }
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the pet list");
        int size = sc.nextInt();
        Pet[] petsArray = new Pet[size]; // Comparator Array
        for(int i=0; i<size; i++){
            petsArray[i] =  new Pet(sc.nextInt(),sc.next());
        }
        sc.close();
        Arrays.sort(petsArray, (i,j)->i.sno>j.sno?-1:1);
        for(Pet p1: petsArray){
            System.out.println(p1);
        }
    }
}
