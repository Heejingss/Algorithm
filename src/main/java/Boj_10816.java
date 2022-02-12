import java.io.*;
import java.util.*;

public class Boj_10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(list);

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int findN = Integer.parseInt(st3.nextToken());
        int[] findList = new int[n];

        StringTokenizer st4 = new StringTokenizer(br.readLine());
        for (int i = 0; i < findN; i++) {
            findList[i] = Integer.parseInt(st4.nextToken());
        }

        for (int i = 0; i < findN; i++) {
            int lowIndex = lower_binarySearch(list, 0, n, findList[i]);
            int upperIndex = upper_binarySearch(list, 0, n, findList[i]);
            bw.append((upperIndex - lowIndex) + " ");

        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static int lower_binarySearch(int[] list, int left, int right, int target) {

        while (left < right) {
            int mid = (left + right) / 2;

            if (list[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    public static int upper_binarySearch(int[] list, int left, int right, int target) {

        while (left < right) {
            int mid = (left + right) / 2;

            if (list[mid] <= target) {
                left = mid + 1;

            } else {
                right = mid;
            }

        }

        return right;
    }

}
