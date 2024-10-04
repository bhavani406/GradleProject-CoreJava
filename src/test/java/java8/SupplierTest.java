package java8;
import java.time.LocalDate;
import java.util.Date;
import java.util.function.*;

public class SupplierTest {

    public static void main(String[] args) {
    Supplier<LocalDate> sup = LocalDate::now;
    System.out.println(sup.get());
    Supplier<Date> sup1 = ()->new Date();
        System.out.println(randomGenerator(8));
    }

    //Random OTP {0 to 9}
    static int randomGenerator(int j){
        Supplier<String> s = ()-> {   //() y because its not taking any value as argument
            String otpVal="";
            for(int i=0;i<j;i++) {
                otpVal=otpVal+(int)(Math.random()*10);
            }
            return otpVal;
        };
        int otpV= Integer.parseInt(s.get());
        return otpV;
    }

 }