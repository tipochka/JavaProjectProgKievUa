package java_start.Practic7;

/**
 * Created by Xepcoh on 10.09.2016.
 */
public class SumArrayElem {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, -1};
        int sumElem = sumElem(array);
        System.out.println(sumElem);
    }

    public static int sumElem(int[] array) {
        int sum = 0;

        for (int elem : array) {
            sum += elem;
        }

        return sum;
    }
}
