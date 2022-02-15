import java.io.*;
import java.util.*;

public class Boj_10815 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int n2 = Integer.parseInt(st.nextToken());
        int[] list2 = new int[n2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            list2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        for (int i = 0; i < n2; i++) {
            bw.append(binarySearch(0, n - 1, list2[i], list) + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    public static int binarySearch(int left, int right, int target, int[] list) {

        while (left <= right) {
            int mid = (left + right) / 2;

            if (list[mid] == target) {
                return 1;

            } else if (target > list[mid]) {
                left = mid + 1;
            } else if (target < list[mid]) {
                right = mid - 1;
            }
        }

        return 0;
    }
}
