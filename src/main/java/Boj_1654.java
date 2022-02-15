import java.util.*;
import java.io.*;

public class Boj_1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] list = new int[k];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);

        bw.append(binarySearch(1, list[k - 1], count, list) + " ");
        bw.flush();
        bw.close();
        br.close();

    }

    public static long binarySearch(long left, long right, long count, int[] list) {

        while (left <= right) {
            long sum = 0;
            long mid = (left + right) / 2;

            for (int i = 0; i < list.length; i++) {
                sum = sum + list[i] / mid;
            }

            if (sum >= count) {
                left = mid + 1;
            } else if (sum < count) {
                right = mid - 1;
            }
        }

        return right;
    }
}
