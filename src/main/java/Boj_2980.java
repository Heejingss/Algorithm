import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Boj_2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int road = Integer.parseInt(st.nextToken());
        int[][] list = new int[n + 1][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
            list[i][2] = Integer.parseInt(st.nextToken());
        }
        list[n][0] = road;
        list[n][1] = 0;
        list[n][2] = 0;

        int time = list[0][0];

        for (int i = 0; i < n; i++) {
            int waittime = 0;
            int cycle = list[i][1] + list[i][2];
            if (time % cycle < list[i][1]) {
                waittime = (list[i][1] - time % cycle);
            }
            time = time + waittime;
            time = time + (list[i + 1][0] - list[i][0]);
        }

        System.out.println(time);
    }
}
