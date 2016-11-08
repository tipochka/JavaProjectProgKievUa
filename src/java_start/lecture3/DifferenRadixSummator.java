package java_start.lecture3;

import java.util.Scanner;

/**
 * Created by Xepcoh on 31.08.2016.
 */
public class DifferenRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X in Bin: ");
        int x = scanner.nextInt(2);

        System.out.print("Enter Y in Oct: ");
        int y = scanner.nextInt(8);

        System.out.print("Enter Z in Hex: ");
        int z = scanner.nextInt(16);

        int sum = x + y + z;
        String stringOut = "X + Y + Z = " + sum;

        System.out.println(stringOut);

    }


}
