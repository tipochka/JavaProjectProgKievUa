package java_start.lecture4_2;

/**
 * Created by Xepcoh on 07.09.2016.
 */
public class DigitsSumCalculator {
    public static void main(String[] args) {
        int from = 10;
        int to = 1;

        if (from > to) {
            throw new IllegalArgumentException("from may be <= to");
        }

        int n;
        int a;
        int r=0;

        for (int i = from; i<=to; i++) {
            n = Math.abs(i);

            for(int j = 10; j>= 0 ; j--){
                a = n/(int)Math.pow(10, j);
                if (a==0){
                    continue;
                }

                r += a%10;
            }
        }

        System.out.println(r);
    }
}