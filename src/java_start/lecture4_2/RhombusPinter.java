package java_start.lecture4_2;

/**
 * Created by Xepcoh on 08.09.2016.
 */
public class RhombusPinter {
    public static void main(String[] args) {
        int size = 9;
        int center = size/2 + 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j<=size; j++) {
                if (j == (1 + Math.abs(center-i)) || j == (size - Math.abs(center-i))) {
                    System.out.print("*");
                }else {
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }
}
