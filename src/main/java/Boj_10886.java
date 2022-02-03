
import java.util.*;
import java.io.*;

public class Boj_10886 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = Integer.parseInt(str);

        int agree = 0;
        int disagree = 0;

        for (int i = 0; i < count; i++) {

            String str2 = br.readLine();
            int score = Integer.parseInt(str2);

            if (score == 0) {
                disagree++;
            } else {
                agree++;
            }

        }

        if (disagree > agree) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }

}
