package CoreJava.Arrays;

public class Test4CheckArraysEqual{

    static boolean compareArray(int[]a1,int[] a2){
        boolean result=true;
        if(a1.length == a2.length){
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]) result=false;
            }
        }
        else {
            result=false;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={1,2,3,4};
        System.out.println(compareArray(a,b));

    }
}
