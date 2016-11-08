package java_start.lecture4_1;

/**
 * Created by Xepcoh on 02.09.2016.
 */
public class AgeParser {
    public static void main(String[] args) {
        String ageString = "121";

        try {

            int result = Integer.parseInt(ageString);
            if (!(result >= 1 && result <= 120)) {
                throw new IllegalArgumentException("argument must be in the range [1..120], but actually is "+ result);
            }

            System.out.println(result);
        }catch (Exception e) {
            throw new IllegalArgumentException("argument must be int");
        }
    }

}
