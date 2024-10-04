package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalTest {
    // String uppercase check string is not null
    public static void main(String[] args) {
        Optional<String> nameContainer = getName();

//        //isPresent
//        if(nameContainer.isPresent()){
//            String name = nameContainer.get(); //if no element throws nosuchelementexception
//            System.out.println(name.toUpperCase());
//        }
//        if(nameContainer.isEmpty()){
//            System.out.println("empty optional");
//        }
//        ///////////////////////////////////////////////////////////////////////
//        //ifPresent
//        nameContainer.ifPresent(val-> System.out.println(val.toUpperCase()));
//        nameContainer.ifPresentOrElse(
//                val-> System.out.println(val.toUpperCase()),
//                ()-> System.out.println("value not presented"));
        ////////////////////////////////////////////////////////////
        //filter
        String verifiedContainer = nameContainer.filter(val->val.equalsIgnoreCase("BHAVANI")).get();
        //System.out.println(verifiedContainer.get());
        ////////////////////////////////////////////////////////////
        //map->Function:  input-> perform some operation-> output=type value <Optional<T> map(Function mapper)
        Optional<String> nameCOn = Optional.of("aditya miryala");
        String converted = nameCOn.map(String::toUpperCase).get();
        //////////////////////////////////////
        //flatMap -> used to flattening the Optional of Otional values
        Optional<Optional<String>> nameValues = Optional.of(Optional.of("abhay mitra"));
        String valueUpper = nameValues.flatMap(val->val).get().toUpperCase(); //flatMap(v_>) flattening all the objects


    }
    static Optional<String> getName(){
        // keep the actual value inside a optional object-container
        String name = "bhavani";
        Optional<String> value = null;
        if(name==null){
            value= Optional.empty();
        }else{ value =Optional.of(name);
            System.out.println("value not available");}
        return  value;

//        Optional<String> value =  Optional.of("ghhTYY");
//        return value;
    }
}
