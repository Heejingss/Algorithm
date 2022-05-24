import java.util.*;
import java.io.*;

public class Boj_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        int max = list[n - 1];
        int result = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (list[i] >= max) {
                max--;
                result = result + (list[i] - max);
                // System.out.printf("list[i]:%d, max:%d, result:%d\n", list[i], max, result);
            } else {
                max = list[i];
            }

        }

        bw.append(result + "");
        bw.flush();
        bw.close();
    }
}
