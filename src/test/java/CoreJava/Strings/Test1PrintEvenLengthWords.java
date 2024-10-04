package CoreJava.Strings;

public class Test1PrintEvenLengthWords {
    public static void main(String[] args) {
        String s= "This is a java language";
        for(String s1:s.split(" ")){
            if(s1.length()%2==0) System.out.println(s1);
        }

    }
}
