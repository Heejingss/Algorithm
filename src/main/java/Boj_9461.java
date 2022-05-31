import java.util.*;
import java.io.*;

public class Boj_9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            bw.append(find(temp) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static long find(int a) {

        if (a <= 3) {
            return 1;
        } else if (a == 4 || a == 5) {
            return 2;
        } else {
            long[] list = new long[a + 1];
            for (int i = 1; i <= a; i++) {
                if (i <= 3) {
                    list[i] = 1;
                } else if (i <= 5) {
                    list[i] = 2;
                } else {
                    list[i] = list[i - 1] + list[i - 5];
                }
            }
            return list[a];
        }

    }

}
