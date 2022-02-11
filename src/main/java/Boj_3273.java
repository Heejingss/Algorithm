import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Boj_3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] list = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st2.nextToken());

        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st3.nextToken());
        int count = 0;
        Arrays.sort(list);

        for (int i = 0; i < n - 2; i++) {
            if (binarySearch(list, i + 1, n - 1, sum - list[i])) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean binarySearch(int[] list, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list[mid] == target)
                return true;

            if (list[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;

    }

}
