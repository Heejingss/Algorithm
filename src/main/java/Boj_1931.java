import java.util.*;
import java.io.*;

public class Boj_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[i][0] = start;
            list[i][1] = end;
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if (s1[1] == s2[1]) {
                    return s1[0] - s2[0];
                } else {
                    return s1[1] - s2[1];
                }
            }
        });

        // for (int i = 0; i < n; i++) {
        // System.out.println(list[i][0] + "," + list[i][1]);
        // }
        int count = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            if (end <= list[i][0]) {
                end = list[i][1];
                count++;
            }
        }

        bw.append(count + "");
        bw.flush();
        bw.close();
    }

}
