import java.util.*;
import java.io.*;

public class Boj_1004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for (int j = 0; j < n; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            int end_x = Integer.parseInt(st.nextToken());
            int end_y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(br.readLine());
            int[][] list = new int[m][3];
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                list[i][0] = Integer.parseInt(st.nextToken());
                list[i][1] = Integer.parseInt(st.nextToken());
                list[i][2] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < m; i++) {
                double length = Math.pow(Math.abs(start_x - list[i][0]), 2)
                        + Math.pow(Math.abs(start_y - list[i][1]), 2);
                if (length < Math.pow(list[i][2], 2)) {
                    count++;
                }

            }

            for (int i = 0; i < m; i++) {
                double length = Math.pow(Math.abs(end_x - list[i][0]), 2) + Math.pow(Math.abs(end_y - list[i][1]), 2);
                if (length < Math.pow(list[i][2], 2)) {
                    count++;
                }

            }
            for (int i = 0; i < m; i++) {
                double length1 = Math.pow(Math.abs(start_x - list[i][0]), 2)
                        + Math.pow(Math.abs(start_y - list[i][1]), 2);
                double length2 = Math.pow(Math.abs(end_x - list[i][0]), 2) + Math.pow(Math.abs(end_y - list[i][1]), 2);
                if (length1 < Math.pow(list[i][2], 2) && length2 < Math.pow(list[i][2], 2)) {
                    count = count - 2;
                }

            }
            bw.append(count + "\n");
            count = 0;
        }

        bw.flush();
        bw.close();
    }

}
