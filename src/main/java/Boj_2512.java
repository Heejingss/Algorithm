import java.io.*;
import java.util.*;

public class Boj_2512 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int limitBudget = Integer.parseInt(br.readLine());

        int left = 0;
        int right = -1;

        for (int i = 0; i < n; i++) {
            right = Math.max(right, list[i]);
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (list[i] >= mid) {
                    sum = sum + mid;
                } else {
                    sum = sum + list[i];
                }
            }

            if (sum > limitBudget) {
                right = mid - 1;

            } else {
                left = mid + 1;

            }
        }

        System.out.println(right);
    }

}
