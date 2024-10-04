package CoreJava.Arrays;


// for descending arr[i]<arr[j]
public class Test7ArrayAscending {

    static void ascendingOrder(int arr[], int len){
       int temp=0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: " +arr[len-3]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //System.out.println(len-3);
        }

    }

    public static void main(String[] args) {
        int[] arr= {1,3,2,1,3,3};
        ascendingOrder(arr,arr.length);
    }

}
