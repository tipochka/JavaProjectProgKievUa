package java_start.lecture5_practic;

/**
 * Created by Xepcoh on 05.09.2016
 */
public class Desc {
    public static void main(String[] args) {
        int n = 2;

        boolean white = true;

        for(int i = 1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                String r = (white)?"w"+j:"b"+j;
                System.out.println(r);
            }
            white = !white;
        }

        for (int i = 1; i<=n; i++){
            String r = (white)?"w"+i:"b"+i;
            System.out.println(r);
        }
        white = !white;

        for (int i = n; i>=1; i--) {
            for (int j=n+1-i; j<=n; j++) {
                String r = (white)?"w"+j:"b"+j;
                System.out.println(r);
            }
            white = !white;
        }

    }
}
