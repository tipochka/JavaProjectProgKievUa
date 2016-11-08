package java_start.lecture4_1;

/**
 * Created by Xepcoh on 03.09.2016.
 */
public class ToyNameToldConverter {
    public static void main(String[] args) {
        String name = "Doll";
        int outId;

        switch (name) {
            case "Car": outId = 0;
                break;
            case "Lego": outId = 1;
                break;
            case "Doll": outId = 2;
                break;
            case "Puzzle": outId = 3;
                break;
            default:
                throw new IllegalArgumentException("Not name");
        }
        System.out.println(outId);
    }
}
