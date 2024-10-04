package CoreJava;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

public class CustomAgeException {
     static void checkAge(int age) throws InvalidAgeException{
         if(age < 18){
             throw new InvalidAgeException("age is not valid to vote");
         }
         else System.out.println("valid to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(13);
        }
        catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("rest of the code");
    }
}
