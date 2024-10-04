package java8;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunc {
    public static boolean strRev(String input ) {
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };
        boolean result = isPalindrome.test(input);
        return result;
    }
    public static void main(String[] args) {
        Predicate<Integer> func = x->x>5;
//        System.out.println(func.test(6));
//        List<Integer> list = Arrays.asList(3,5,8);
//        List<Integer> result = list.stream().filter(func).toList();
//        System.out.println(result);
//        List<String> list1 =  Arrays.asList("bhanu","bhagu","ruthi");
//        Predicate<String> pred1 = x->x.startsWith("bha");
//        List<String> namesList = list1.stream().filter(pred1.negate()).toList();
//        System.out.println(namesList);
//        System.out.println(PredicateFunc.strRev("ara"));

        Emp e1 = new Emp(101,"bhanu",234.5);
        Emp e2 = new Emp(102,"adi",324.5);
        Emp e3 = new Emp(103,"abhay",444.5);

        List<Emp> listEmp = List.of(e1,e2,e3);

        Predicate<Emp> preEmp = x->x.getSalary()>240;
        //System.out.println("check:  "  +preEmp.test(e1));
        Optional<String> str= listEmp.stream().filter(preEmp).map(Emp::getName).findAny();
        str.ifPresent(System.out::println);

       Optional<Emp> maxEmp = listEmp.stream().max(Comparator.comparingDouble(Emp::getSalary));
       maxEmp.ifPresent(System.out::println);
                       //or
        Emp maxEp = listEmp.stream().max(Comparator.comparingDouble(Emp::getSalary)).get();
        System.out.println(maxEp);

    }



}
