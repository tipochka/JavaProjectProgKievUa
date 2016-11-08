package java_start.lecture4_2;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class MinMaxCalculator {
    public static void main(String[] args) {

        System.out.println("min = " + min(10, 30) + ", max = " + max(10, 30));
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
