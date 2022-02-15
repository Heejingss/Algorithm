
import java.io.*;
import java.util.*;

public class Boj_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[count];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int count2 = Integer.parseInt(st.nextToken());
        int[] arr2 = new int[count2];

        st = new StringTokenizer(br.readLine());
        String result = "";
        for (int i = 0; i < count2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(arr1);

        for (int i = 0; i < count2; i++) {
            bw.append(binarySearch(0, count - 1, arr2[i], arr1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

        System.out.println(result.trim());
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
