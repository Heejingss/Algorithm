import java.io.*;
import java.util.*;

public class Boj_17521 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        long n = (long) days;
        long cash = Long.parseLong(st.nextToken());
        int[] list = new int[days];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        long count = 0;
        for (int i = 1; i < n; i++) {
            if (list[i - 1] < list[i]) {
                count = cash / list[i - 1];
                cash = cash + (list[i] - list[i - 1]) * count;
            }
        }

        bw.append(cash + "");
        bw.flush();
        bw.close();
    }

}
