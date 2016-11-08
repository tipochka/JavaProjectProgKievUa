package java_start.lecture5_practic;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class RandomGame {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;

        Random z = new Random();
        int n = z.nextInt(100) + 1;

        System.out.println(n);

        System.out.println(from + "..." +to);
        Scanner scanner = new Scanner(System.in);


        while(!scanner.hasNextInt()) {
            System.out.println("Enter int argument, pleas!");
            scanner.next();
        }

        int a = scanner.nextInt();

        while (a != n) {

            if (a>to || a<from){
                System.out.println("You enter uncorrected argument. Arg. may be range "+from + "..." +to);
            }else {
                if (n < a) {
                    to = a - 1;
                } else {
                    from = a + 1;
                }

                System.out.println(from + "..." + to);
            }

            while(!scanner.hasNextInt()) {
                System.out.println("Enter int argument, pleas!");
                scanner.next();
            }

            a = scanner.nextInt();


        }

        System.out.println("WIN!");


    }
}
