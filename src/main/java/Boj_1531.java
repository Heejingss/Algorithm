import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Boj_1531 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] list = new int[n][4];
        int[][] moz = new int[100][100];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
            list[i][2] = Integer.parseInt(st.nextToken());
            list[i][3] = Integer.parseInt(st.nextToken());

            for (int j = list[i][1] - 1; j < list[i][3]; j++) {
                for (int k = list[i][0] - 1; k < list[i][2]; k++) {
                    moz[j][k]++;
                }
            }
        }

        // for (int i = 0; i < 100; i++) {
        // for (int j = 0; j < 100; j++) {
        // for (int k = 0; k < n; k++) {
        // if ((i >= list[k][0] && i <= list[k][2]) && (j >= list[k][1] && j <=
        // list[k][3])) {
        // moz[i][j]++;
        // }
        // }
        // }
        // }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (moz[i][j] > m) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
