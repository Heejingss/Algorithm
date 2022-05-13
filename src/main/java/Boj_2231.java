import java.io.*;
import java.util.*;

public class Boj_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int temp = 0;
            temp = i;
            int j = i;
            while (j > 0) {
                temp = temp + j % 10;
                j = j / 10;
            }

            if (temp <= n) {
                if (list[temp] != 0) {
                    continue;
                }
                list[temp] = i;
            }

        }
        bw.append(list[n] + "");
        bw.flush();
        bw.close();
    }

}
