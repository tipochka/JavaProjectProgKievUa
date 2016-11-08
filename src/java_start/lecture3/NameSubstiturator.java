package java_start.lecture3;

import java.util.Scanner;

/**
 * Created by Xepcoh on 31.08.2016.
 */
public class NameSubstiturator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        String stringOut = message.replace("${name}", name);

        System.out.println(stringOut);

    }
}
