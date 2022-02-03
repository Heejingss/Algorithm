
import java.io.*;
import java.util.*;

public class Boj_1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birds = Integer.parseInt(st.nextToken());
        int seconds = 0;

        for (int i = 1;; i++) {
            if (birds - i >= 0) {
                seconds++;
                if (birds - i == 0) {
                    break;
                }
                birds = birds - i;
            } else {
                i = 0;
            }
        }

        System.out.println(seconds);

    }

}
