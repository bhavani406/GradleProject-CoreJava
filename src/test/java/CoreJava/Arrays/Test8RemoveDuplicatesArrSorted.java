package CoreJava.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//U CAN DIRECTLY USE SET
public class Test8RemoveDuplicatesArrSorted {

    static void dupEleminate(int[] arr, int n){
        int j=0;
        int[] temp =  new int[n];
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        //temp[j++] = arr[n-1]; // temp[j]=arr[4];j++ = j=0,1,..upto length
        for (int i=0; i<n; i++){
            arr[i] = temp[i];
        }
        //printing value after removing duplicate
        for (int i=0; i<j; i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr  ={1,3,4,6,3,2,1,5,5};
        Arrays.sort(arr);
        dupEleminate(arr,arr.length);
//        HashSet<Integer> dup = new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            dup.add(arr[i]);
//        }
//        dup.stream().sorted().toList().forEach(x-> System.out.print(x+" "));
//        System.out.println(dup);
    }
}

