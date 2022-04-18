import java.util.*;
import java.io.*;

public class Boj_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a - b;
        long result = 0;

        long count2 = find(a, 2) - find(b, 2) - find(c, 2);
        long count5 = find(a, 5) - find(b, 5) - find(c, 5);

        result = count2 > count5 ? count5 : count2;
        System.out.println(result);

        // 반복문 6개
        // result = a2 - b2 - c2 > a5 - b5 - c5 ? a5 - b5 - c5 : a2 - b2 - c2;
        // int tempa = a;
        // int tempb = b;
        // int tempc = c;
        // long a5 = 0;
        // long a2 = 0;
        // long b5 = 0;
        // long b2 = 0;
        // long c5 = 0;
        // long c2 = 0;
        // while (tempa >= 5) {
        // a5 = a5 + tempa / 5;
        // tempa = tempa / 5;
        // }
        // while (tempb >= 5) {
        // b5 = b5 + tempb / 5;
        // tempb = tempb / 5;
        // }
        // while (tempc >= 5) {
        // c5 = c5 + tempc / 5;
        // tempc = tempc / 5;
        // }
        // while (a >= 2) {
        // a2 = a2 + a / 2;
        // a = a / 2;
        // }
        // while (b >= 2) {
        // b2 = b2 + b / 2;
        // b = b / 2;
        // }
        // while (c >= 2) {
        // c2 = c2 + c / 2;
        // c = c / 2;
        // }

    }

    public static long find(int a, int b) {
        long count = 0;
        while (a >= b) {
            count = count + a / b;
            a = a / b;
        }
        return count;
    }

}
