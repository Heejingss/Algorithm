
import java.util.*;
import java.io.*;

public class Boj_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[][] list = new int[count][2];
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if (s1[1] == s2[1])
                    return s1[0] - s2[0];
                else {
                    return s1[1] - s2[1];
                }
            }
        });

        for (int i = 0; i < count; i++) {
            System.out.print(list[i][0] + " ");
            System.out.println(list[i][1]);
        }

    }

}
