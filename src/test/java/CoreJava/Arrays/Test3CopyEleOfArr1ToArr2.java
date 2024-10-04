package CoreJava.Arrays;

public class Test3CopyEleOfArr1ToArr2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b= new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        //  // Changing b[] to verify that
        //        // b[] is different from a[] --
        b[0]++;  // o/p:  2 2 3
        System.out.println("Contents of a[] ");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        // Display message only
        System.out.println("\n\nContents of b[] ");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }

}
