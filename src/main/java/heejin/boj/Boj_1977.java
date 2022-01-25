package heejin.boj;

import java.io.*;
import java.util.*;

public class Boj_1977 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int minNum = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int maxNum = Integer.parseInt(st2.nextToken());

        int sqrt = 0;
        int min = 0;
        int sum = 0;

        for (int i = maxNum; i >= minNum; i--) {
            sqrt = (int) Math.sqrt(i);
            if (Math.sqrt(i) == sqrt) {
                min = i;
                sum = sum + i;

            }

        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

}
