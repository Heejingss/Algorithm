import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class Boj_2548 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);
        int result = 0;
        int min = n * list[n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + Math.abs(list[i] - list[j]);
            }
            // System.out.println("sum:" + sum + " min:" + min);
            if (sum < min) {
                min = sum;
                result = list[i];
            }
            sum = 0;
        }

        System.out.println(result);
    }

}
