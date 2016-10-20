package sorts;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Maria.Guseva on 18.10.2016.
 */
//Complexity is O(nlogn)
public class MergeSort {
    public static void main(String args[]){
        int[] a = {1, 5, 7, 3, 9, 4, 6, 2, 0, 5};
        System.out.println("The initial array: " + Arrays.toString(a));

        mergeSort(a);
        System.out.println("The sorted array: " + Arrays.toString(a));
    }

    public static void mergeSort(int[] a){
        int len = a.length;
        mergeSort(a, 0, len-1);
    }

    public static void mergeSort(int[] a, int left, int right){
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, left, center);
            mergeSort(a, center + 1, right);
            merge(a, Arrays.copyOfRange(a, left, center+1), Arrays.copyOfRange(a, center+1, right+1), left);
        }
    }

    public static void merge(int[] a, int[] leftArray, int[] rightArray, int leftEnd){
        int lenLeft = leftArray.length;
        int lenRight = rightArray.length;
        int lenAll = lenLeft + lenRight;
        int[] mergedArray = new int[lenAll];
        int iLeft = 0;
        int iRight = 0;
        int i = 0;

        while (iLeft < lenLeft && iRight < lenRight){
            if (leftArray[iLeft] >= rightArray[iRight]){
                mergedArray[i++] = rightArray[iRight++];
            }
            else {
                mergedArray[i++] = leftArray[iLeft++];
            }
        }
        if (iLeft == lenLeft){
            for (int j = i; j < lenAll; j++){
                mergedArray[j] = rightArray[iRight++];
            }
        }
        else{
            for (int j = i; j < lenAll; j++){
                mergedArray[j] = leftArray[iLeft++];
            }
        }

        for (int k = 0; k  < lenAll; k++){
            a[leftEnd] = mergedArray[k];
            leftEnd++;
        }
    }
}
