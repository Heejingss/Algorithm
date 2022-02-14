import java.io.*;
import java.util.*;

public class Boj_2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(list);

        long left = 0;
        long right = list[n - 1];

        while (left <= right) {
            long mid = (left + right) / 2;

            long sum = 0;
            for (int j = 0; j < n; j++) {
                if (list[j] > mid) {
                    sum = sum + (list[j] - mid);
                }
            }

            // if (sum == result) {
            // System.out.println(mid);
            // break;
            // } else if (sum > result) {
            // left = mid + 1;
            // } else {
            // right = mid;
            // }

            if (sum >= result) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }

        System.out.println(right);
    }

}
