package CoreJava.Arrays;

public class Test13MirrorSizeArray {

    // Method to check if an array is a MirrorSizeArray (palindromic array)
    public static boolean isMirrorSizeArray(int[] arr) {
        int n = arr.length;

        // Loop to compare elements from front and back
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false; // If any pair doesn't match, it's not a MirrorSizeArray
            }
        }
        return true; // If all pairs match, it's a MirrorSizeArray
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 2, 1};  // MirrorSizeArray
        int[] arr2 = {5, 10, 15, 10, 5};  // MirrorSizeArray
        int[] arr3 = {1, 2, 3, 4};  // Not a MirrorSizeArray

        // Checking arrays
        System.out.println("Is arr1 a MirrorSizeArray? " + isMirrorSizeArray(arr1));  // true
        System.out.println("Is arr2 a MirrorSizeArray? " + isMirrorSizeArray(arr2));  // true
        System.out.println("Is arr3 a MirrorSizeArray? " + isMirrorSizeArray(arr3));  // false
    }
}

