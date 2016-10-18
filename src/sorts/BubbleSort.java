package sorts;

import java.util.Arrays;
/**
 * Created by Maria.Guseva on 18.10.2016.
 */
//Complexity is O(n^2)
public class BubbleSort {
    public static void main(String args[]){
        int[] a = {1, 5, 7, 3, 5, 4, 6, 1};
        System.out.println("The initial array: " + Arrays.toString(a));
        int len = a.length;
        int temp = 0;

        for (int i = 0; i < len-1; i++){
            for (int j = 0; j < len-i-1; j++){
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
