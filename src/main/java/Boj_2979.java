
import java.io.*;
import java.util.*;

public class Boj_2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int fee1 = Integer.parseInt(st.nextToken());
        int fee2 = Integer.parseInt(st.nextToken());
        int fee3 = Integer.parseInt(st.nextToken());
        int totalFee = 0;
        int[][] list = new int[3][101];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j < b; j++) {
                list[i][j] = 1;
            }
        }

        for (int i = 0; i < 101; i++) {
            if (list[0][i] + list[1][i] + list[2][i] == 3) {
                totalFee = totalFee + 3 * fee3;
            } else if (list[0][i] + list[1][i] + list[2][i] == 2) {
                totalFee = totalFee + 2 * fee2;
            } else if (list[0][i] + list[1][i] + list[2][i] == 1) {
                totalFee = totalFee + 1 * fee1;
            }
        }
        System.out.println(totalFee);

    }

}
