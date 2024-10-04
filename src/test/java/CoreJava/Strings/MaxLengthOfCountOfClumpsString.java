package CoreJava.Strings;

public class MaxLengthOfCountOfClumpsString{

    private static int maxLength(String str){

        int curLength=1;
        int maxLength =1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                curLength++;

            }
            else{
                maxLength= Math.max(maxLength,curLength);
                curLength=1; // reset the cur length if elements are not matched
            }

        }

        maxLength= Math.max(maxLength,curLength);
        return maxLength;
    }

    public static void main(String[] args) {
      String str = "abcccyyyyyyddd";
      int length = maxLength(str);
        System.out.println("max lenth is:  " +length);

    }
}

