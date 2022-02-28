import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_14469 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] list = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                return s1[0] - s2[0];
            }
        });
        int total = list[0][0] + list[0][1];

        for (int i = 1; i < n; i++) {
            if (total > list[i][0]) {
                total = total + list[i][1];
            } else {
                total = list[i][0] + list[i][1];
            }
        }
        System.out.println(total);

    }

}
