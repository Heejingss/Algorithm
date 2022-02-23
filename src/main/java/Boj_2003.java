import java.io.*;
import java.util.*;

public class Boj_2003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (true) {

            if (sum >= result) {
                sum = sum - list[start];
                start++;
            } else if (end >= n) {
                break;
            } else {
                sum = sum + list[end];
                end++;
            }

            if (sum == result) {
                // System.out.println("i:" + start + "j" + end + "개수:" + count);
                count++;
            }
            // System.out.println("start:" + start + " end" + end + " 합:" + sum);
        }
        System.out.println(count);
    }

}
