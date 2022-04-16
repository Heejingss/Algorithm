import java.util.*;
import java.io.*;

public class Boj_5533 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][3];
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st;
        int[] total = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
            list[i][2] = Integer.parseInt(st.nextToken());

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                map.put(list[j][i], map.getOrDefault(list[j][i], 0) + 1);
            }
            for (int j = 0; j < n; j++) {
                if (map.get(list[j][i]) == 1) {
                    total[j] = total[j] + list[j][i];
                }
            }
            map = new HashMap<>();
        }
        for (int i = 0; i < n; i++) {
            bw.append(total[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

}
