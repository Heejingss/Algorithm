import java.util.*;
import java.io.*;

public class Boj_2167 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] list = new int[a][b];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                int temp = Integer.parseInt(st.nextToken());
                list[i][j] = temp;
            }
        }

        int n = Integer.parseInt(br.readLine());
        for (int p = 0; p < n; p++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int k = i; k <= x; k++) {
                for (int c = j; c <= y; c++) {
                    sum = sum + list[k - 1][c - 1];
                }

            }
            bw.append(sum + "\n");
            sum = 0;

        }
        bw.flush();
        bw.close();

    }

}
