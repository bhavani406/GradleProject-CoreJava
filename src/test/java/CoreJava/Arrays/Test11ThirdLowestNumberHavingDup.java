package CoreJava.Arrays;

public class Test11ThirdLowestNumberHavingDup {

    public static int findThirdLargest(int[] array) {
        // Edge case: if there are fewer than 3 distinct elements
        if (array.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements");
        }

        // Initialize first, second, and third largest distinct elements
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        // Traverse the array
        for (int num : array) {
            // Skip this number if it's already the first, second, or third largest (duplicate)
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num < first) {
                // Update third, second, and first
                third = second;
                second = first;
                first = num;
            } else if (num < second) {
                // Update third and second
                third = second;
                second = num;
            } else if (num < third) {
                // Update third
                third = num;
            }
        }

        // Check if third largest distinct element was found
        if (third == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array must have at least 3 distinct elements");
        }

        return third;
    }

    public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {3,3,1,3};

        // Find third largest distinct element
        try {
            int thirdLargest = findThirdLargest(array);
            System.out.println("The third largest distinct element is: " + thirdLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
