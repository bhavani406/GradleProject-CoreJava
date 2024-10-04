package CoreJava.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Test12RemoveAllOccurrencesOfEle {

    static List<Integer> removeOccu(int[] arr, int k){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=k){
               list.add(arr[i]);
           }
        }
        return list;

    }

    public static void main(String[] args) {
        int[] arr = {12,3,5,6,7,3,8};
        List<Integer> list = removeOccu(arr,3);
        System.out.println(list);
    }

}
