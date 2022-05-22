import java.util.*;
import java.io.*;

public class Boj_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                list[i] = 0;
            } else if (i == 2) {
                list[i] = 1;
            } else if (i == 3) {
                list[i] = 1;
            } else {
                int temp = i - 1;
                if (i % 3 == 0) {
                    temp = Math.min(temp, list[i / 3] + 1);
                }
                if (i % 2 == 0) {
                    temp = Math.min(temp, list[i / 2] + 1);
                }
                temp = Math.min(temp, list[i - 1] + 1);
                list[i] = temp;
            }
        }

        System.out.println(list[n]);
    }

}
