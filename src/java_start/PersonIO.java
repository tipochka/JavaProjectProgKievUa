package java_start;

import java.util.Scanner;

/**
 * Created by Xepcoh on 27.08.2016.
 */
public class PersonIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        scanner.close();

        String stringOut = "My name is " + name;

        System.out.println(stringOut);


    }
}
