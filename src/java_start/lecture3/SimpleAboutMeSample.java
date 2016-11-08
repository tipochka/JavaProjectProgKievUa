package java_start.lecture3;

import java.util.Scanner;

/**
 * Created by Xepcoh on 31.08.2016.
 */
public class SimpleAboutMeSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String stringOut = "I'm "+name+" "+surname +", "+age+" years old";

        System.out.println(stringOut);

    }
}
