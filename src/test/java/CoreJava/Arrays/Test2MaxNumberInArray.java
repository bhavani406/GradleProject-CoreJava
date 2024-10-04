package CoreJava.Arrays;

import java.util.Arrays;

public class Test2MaxNumberInArray{

    static int largest(int[] arr){

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static int smallest(int[] arr){

        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr= {3,5,6,7,8,};
        System.out.println(largest(arr));
        System.out.println(smallest(arr));

        //streams
        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
