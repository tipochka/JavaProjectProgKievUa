package java_start.lecture4_2;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class DigitsPrinter {
    public static void main(String[] args) {
        int n = -147292;

        if (n < 0) {
            System.out.print("-");
        }

        n = Math.abs(n);
        int a;

        for(int i = 10; i>= 0 ;i--){
            a = n/(int)Math.pow(10, i);
            if (a==0){
                continue;
            }

            int b = a%10;
            System.out.print(" ");
            System.out.print(b);
        }


    }
}
