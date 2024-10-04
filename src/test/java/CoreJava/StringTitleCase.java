package CoreJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTitleCase {
    public static void main(String[] args) {
        String string = "this is a sample string";
        String titleCaseString = Arrays.stream(string.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.println(titleCaseString);

    }
}
