package CollectioAPI;


import OOPS.PizzaBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListStudent {
    public static void main(String[] args) {

        Student s1= new Student(101,"ravi",15);
        Student s2= new Student(102,"lekha",16);
        Student s3= new Student(103,"bittu",17);
        ArrayList<Student> studentArrayList =  new ArrayList<Student>(){{add(s1);add(s2);add(s3);}};
        //ArrayList<Student> students = new ArrayList<>(Arrays.asList(s1,s2));
        //System.out.println(studentArrayList);
        Iterator<Student> itr = studentArrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





    }


}
