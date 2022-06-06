import java.util.*;
import java.io.*;

public class Boj_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] list = new int[m];
            int sum = 0;
            for (int j = 0; j < m; j++) {
                list[j] = Integer.parseInt(st.nextToken());
                sum += list[j];
            }
            double a = 0;
            a = (double) sum / m;
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (list[j] > a) {
                    count++;
                }
            }
            String str = String.format("%.3f", count * 100.0 / m);
            bw.append(str + "%\n");

        }

        bw.flush();
        bw.close();
    }

}
