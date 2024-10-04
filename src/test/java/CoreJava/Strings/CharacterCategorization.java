package CoreJava.Strings;

import java.util.ArrayList;
import java.util.List;

public class CharacterCategorization {

    static void categorizeCharacters(String str){
        List<Character> alphabets =  new ArrayList<>();
        List<Character> numbers =  new ArrayList<>();
        List<Character> specialCharacters =  new ArrayList<>();
        for(char c: str.toCharArray()) {
            if(Character.isLetter(c)) alphabets.add(c);
            else if(Character.isDigit(c)) numbers.add(c);
            else specialCharacters.add(c);
        }
        System.out.println("Alphabets are:  " +alphabets);
        System.out.println("Numbers are:  " +numbers);
        System.out.println("SpecialCharacters are:  " +specialCharacters);
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        String str = "Hello123! Welcome to @2024";
        categorizeCharacters(str);
    }
}
