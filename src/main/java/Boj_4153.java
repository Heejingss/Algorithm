import java.io.*;
import java.util.*;

public class Boj_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String result = "";
        for (int i = 0;; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            if (num1 == 0) {
                break;
            }
            result += checkP(num1, num2, num3);

        }

        System.out.println(result.trim());
    }

    static String checkP(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            if (a * a == b * b + c * c) {
                return "right\n";

            } else {
                return "wrong\n";
            }

        } else if ((b > a) && (b > c)) {
            if (b * b == a * a + c * c) {
                return "right\n";

            } else {
                return "wrong\n";
            }

        } else if ((c > a) && (c > b)) {
            if (c * c == a * a + b * b) {
                return "right\n";

            } else {
                return "wrong\n";
            }

        }
        return "";

    }
}
