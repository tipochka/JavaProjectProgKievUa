package java_start;

public class PersonInfo {

    public static void main(String[] args) {
        int days = 392; // Any positive number

        int year = days/361 + 1;
        int month = days%361/31 + 1;
        int day = days - (month-1)*30 - (year-1)*360;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}