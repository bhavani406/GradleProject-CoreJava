package CoreJava.Strings;

public class Test2InsertAStringIntoAnotherString {
    static String insertStr(String originalString,
                          String stringToBeInserted,
                          int index){
        String newStr = new String();
        for(int i=0;i<originalString.length();i++){
            newStr+=originalString.charAt(i);
            if(i==index){
                newStr+=stringToBeInserted;
            }
        }
        return newStr;
    }
    public static void main(String[] args)
    {

        // Get the Strings
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        System.out.println("Original String: "
                + originalString);
        System.out.println("String to be inserted: "
                + stringToBeInserted);
        System.out.println("String to be inserted at index: "
                + index);

        // Insert the String
        System.out.println("Modified String: "
                + insertStr(originalString,
                stringToBeInserted,
                index));
    }
}
