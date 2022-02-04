import java.io.*;
import java.util.*;

public class Boj_1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numList = new int[5];
        for (int i = 0; i < 5; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }
        int max = 1;

        while (true) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (max % numList[i] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(max);
                break;
            }
            max++;
        }

        // for (int i = 0; i < 3; i++) {
        // for (int j = i + 1; j < 4; j++) {
        // int divider = gcd(numList[i], numList[j]);
        // max = numList[i] * numList[j] / divider;
        // for (int k = j + 1; k < 5; k++) {
        // if (max % numList[k] == 0) {
        // System.out.println(max);

        // break;
        // }
        // }

        // }

        // }
    }

    // 최대공약수 구하기
    // static int gcd(int a, int b) {
    // while (b != 0) {
    // int c = a % b;
    // a = b;
    // b = c;
    // }
    // return a;
    // }

}
