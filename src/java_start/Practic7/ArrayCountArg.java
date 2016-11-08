package java_start.Practic7;

import java.util.Arrays;

/**
 * Created by Xepcoh on 10.09.2016.
 */
public class ArrayCountArg {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 2, 1, 3, 8, 1};
        int[] countArg = countElems(array, 10);
        System.out.print(Arrays.toString(countArg));
    }

    public static int[] countElems(int[] array, int maxArg){
        int[] counters = new int[maxArg+1];

        for (int i = 0; i< array.length; i++) {
            counters[array[i]]++;
        }

        return counters;
    }
}
