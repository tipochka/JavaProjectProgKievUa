package oop.lesson1.homework;


import java.text.DateFormatSymbols;
import java.util.Scanner;

public class NumberMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Argument not integer");
        }

        System.out.println(getMonthName(scanner.nextInt()));

    }

    public static String getMonthName(int monthNumber) {
        if (!hasMonth(monthNumber)) {
            throw new IllegalArgumentException("Incorrect month number");
        }

        return new DateFormatSymbols().getMonths()[monthNumber-1];

    }

    public static boolean hasMonth(int monthNumber) {
        if (monthNumber>= 1 && monthNumber <= 12) {
            return true;
        }else {
            return false;
        }
    }
}
