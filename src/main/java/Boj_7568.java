import java.util.*;
import java.io.*;

public class Boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (list[i][0] < list[j][0] && list[i][1] < list[j][1]) {
                    count++;
                }
            }
            list[i][2] = count + 1;
        }

        for (int i = 0; i < n; i++) {
            bw.append(list[i][2] + " ");
        }
        bw.flush();
        bw.close();

    }

}
