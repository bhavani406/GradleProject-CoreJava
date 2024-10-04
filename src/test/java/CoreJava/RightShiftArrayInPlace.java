package CoreJava;

import java.util.Arrays;

public class RightShiftArrayInPlace {

    // Method to right rotate an array by k times
    public static void rightShift(int[] arr, int k) {
        int n = arr.length;

        // Normalize k in case it's greater than the length of the array
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse elements in the array between two indices
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Helper method to print the array (for testing purposes)
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotations = 3;

        System.out.println("Original Array:");
        printArray(arr);

        rightShift(arr, rotations);

        System.out.println("Array after right shift by " + rotations + " times:");
        printArray(arr);
    }
}

