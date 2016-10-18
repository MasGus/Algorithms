package sorts;

import java.util.Arrays;

/**
 * Created by Maria.Guseva on 18.10.2016.
 */
//Complexity is O(n^2)
public class InsertionSort {
    public static void main(String args[]){
        int[] a = {1, 7, 2, 13, 4, 5, 2, 0, 14, 6};
        System.out.println("The initial array: " + Arrays.toString(a));
        int len = a.length;
        int temp = 0;

        for (int i = 0; i < len-1; i++){
            if (a[i] > a[i+1]) {
                while (i >= 0 && a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    i--;
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}
