package java_start.lecture4_2;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class PrimesPrinter {
    public static void main(String[] args) {
        int from = 101;
        int to = 110;

        if (from > to) {
            throw new IllegalArgumentException("from may be <= to");
        }

        outer: for (int i = from; i<=to; i++) {
           if (i <= 1) {
               continue;
           }

           for (int j = 2; j<i; j++) {
               if (i != 2 && i%j == 0) {
                   continue outer;
               }
           }

           System.out.println(i);
        }
    }

}
