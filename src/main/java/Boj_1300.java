import java.io.*;
import java.util.*;

public class Boj_1300 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int left = 1;
        int right = k;

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 0;

            for (int i = 1; i <= N; i++) {
                count = count + Math.min(mid / i, N);
            }

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);

    }

}
