package oop.lesson1.homework;

import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {

        int n = 4;
        Scanner scanner = new Scanner(System.in);
        int countResult = 0;
        int result = 0;

        for (int i = 0; i<n; i++) {
            int number = readInt(scanner);
            if (isPalindrome(number)) {
                if (countResult < 2) {
                    result = number;
                    countResult++;
                }
            }
        }

        System.out.println(stringResult(countResult, result));
    }


    public static int readInt(Scanner scanner) throws IllegalArgumentException {
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Argument may by only int");
        }

        return scanner.nextInt();
    }

    public static boolean isPalindrome(int number) {
        if (number == reverseInt(number)) {
            return true;
        }else {
            return false;
        }
    }

    public static int reverseInt(int number) {
        int reverseInt = 0;

        while (number != 0) {
            reverseInt = reverseInt*10 + number%10;
            number /= 10;
        }

        return reverseInt;
    }

    public static String stringResult(int countResult, int result) {
        if (countResult == 0) {
            return "Non palindrome number";
        }else {
            return Integer.toString(result);
        }
    }
}
