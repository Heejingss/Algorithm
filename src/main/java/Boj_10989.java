import java.util.*;
import java.io.*;

public class Boj_10989 {

    public static void main(String[] args) throws IOException {
        int[] list = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        // int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            while (list[i] > 0) {
                sb.append(i).append('\n');
                list[i]--;
            }
        }
        bw.append(sb);
        bw.flush();
        bw.close();
    }

}
