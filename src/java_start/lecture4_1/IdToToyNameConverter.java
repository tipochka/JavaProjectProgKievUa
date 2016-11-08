package java_start.lecture4_1;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class IdToToyNameConverter {
    public static void main(String[] args) throws IllegalAccessException {
        int id =2;
        String stringOut;

        switch(id) {
            case 0: stringOut = "Car";
                break;
            case 1: stringOut = "Lego";
                break;
            case 2: stringOut = "Doll";
                break;
            case 3: stringOut = "Puzzle";
                break;
            default:
                throw new IllegalAccessException("not id");
        }

        System.out.println(stringOut);
    }

}
