import java.util.*;
import java.io.*;

public class Boj_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] list = new int[m + 1];

        if (n == 1 && m == 1) {
            bw.append(-1 + "");
        } else {
            for (int i = 2; i <= m; i++) {
                if (list[i] == 0) {
                    for (int j = 2; j * i <= m; j++) {
                        list[j * i] = 1;
                    }
                }
            }
            long sum = 0;
            int min = m;

            for (int i = n; i <= m; i++) {
                if (i == 1) {
                    continue;
                }
                if (list[i] == 0) {
                    min = Math.min(i, min);
                    sum = sum + i;
                }

            }
            if (sum != 0) {
                bw.append(sum + "\n");
                bw.append(min + "");

            } else {
                bw.append(-1 + "");

            }
        }

        bw.flush();
        bw.close();
    }
}
