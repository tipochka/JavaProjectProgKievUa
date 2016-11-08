package java_start.lecture3;

import java.util.Scanner;

/**
 * Created by Xepcoh on 31.08.2016.
 */
public class SimpleFuntionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        double result = Math.log(Math.sin(x) + Math.exp(x)*(Math.sqrt(x)/Math.PI));

        String stringOut = "f(x) = " + result;

        System.out.println(stringOut);
    }
}
