package java_start.lecture4_2;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class RadixPrinter {
    public static void main(String[] args) {


        int n = 147292;
        int radix = 2;

        if (radix > 10 || radix<2) {
            throw new IllegalArgumentException("redix arg may be range [2..10]");
        }

        if (n<0) {
            throw new IllegalArgumentException("redix arg may be >=0");
        }

        System.out.println(Integer.toString(n, radix));
    }
}
