package java_start;

import java.util.Scanner;

/**
 * Created by Xepcoh on 27.08.2016.
 */
public class divideInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int1: ");
        int a = scanner.nextInt();
        System.out.print("Enter int2: ");
        int b = scanner.nextInt();
        scanner.close();

        int c = a/b;

        System.out.print(c);


    }
}
