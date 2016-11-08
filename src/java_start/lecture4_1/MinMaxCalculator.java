package java_start.lecture4_1;

/**
 * Created by Xepcoh on 02.09.2016.
 */
public class MinMaxCalculator {
    public static void main(String[] args) {
        int a = 5;
        int b = -2;

        int min;
        int max;

        if (a>b) {
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }

        String stringOut = "max = "+max+", min = " +min;

        System.out.println(stringOut);
    }
}
