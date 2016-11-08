package java_start.Practic7;

import java.util.Arrays;

/**
 * Created by Xepcoh on 10.09.2016.
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {7, 5, 6, 1};
        reverse(array);

        System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] array){

        for (int i = 0, last = array.length / 2; i< last; i++){
            swap(array, i, array.length - 1 - i);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[j];
        array[j] = array[i];
        array[i] = t;
    }
}
