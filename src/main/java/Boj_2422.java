import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Boj_2422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int all = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[][] list = new boolean[all + 1][all + 1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a][b] = true;
            list[b][a] = true;
        }
        int count = 0;
        for (int i = 1; i <= all; i++) {
            for (int j = i + 1; j <= all; j++) {
                if (list[i][j])
                    continue;
                for (int k = j + 1; k <= all; k++) {
                    if (!list[j][k] && !list[k][i]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }

}
