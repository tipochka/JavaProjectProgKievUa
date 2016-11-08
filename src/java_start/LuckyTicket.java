package java_start;

/**
 * Created by Xepcoh on 27.08.2016.
 */
public class LuckyTicket {

    public static void main(String[] args) {

        int d = 0;
        int c = 0;
        for (int i = 0; i <100000; i++) {

            c++;
            int a1 = i%10;
            int a2 = (i/10)%10;
            int a3 = (i/100)%10;

            int b1 = (i/1000)%10;
            int b2 = (i/10000)%10;
            int b3 = (i/100000)%10;

            if (i > 900000) {
                System.out.print(i);
                System.out.println(" | "+b3+b2+b1+a3+a2+a1);
            }

            if((a1+a2+a3) == (b1+b2+b3)) {
//                System.out.print(i);
//                System.out.println(" | "+b3+b2+b1+a3+a2+a1);
                d++;
            }
        }
        double r = (d/1000000.)*100;


        System.out.println(r);

    }
}
