import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.*;

public class Boj_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if (s1[0] == s2[0])
                    return s1[1] - s2[1];
                else {
                    return s1[0] - s2[0];
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(list[i][0] + " " + list[i][1]);
        }

    }

}
