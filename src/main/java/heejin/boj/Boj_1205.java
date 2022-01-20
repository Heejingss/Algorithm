package heejin.boj;

import java.io.*;
import java.util.*;

public class Boj_1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] numList = new int[n];

        if (n != 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                numList[i] = Integer.parseInt(st2.nextToken());
            } // 점수 배열 생성

            if (p == n && score <= numList[n - 1]) {
                System.out.println(-1);
            } else { // n가 주어진 숫자 개수, p이 공간크기
                for (int i = 0; i < n; i++) {
                    if (numList[i] <= score) {
                        System.out.println(i + 1);
                        break;
                    } else if (i == n - 1) {
                        System.out.println(n + 1);

                    }
                }
            }

        } else if (n == 0) { // 무조건 1등
            System.out.println(1);
        }

    }

}
