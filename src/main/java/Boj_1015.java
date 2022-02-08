import java.io.*;
import java.util.*;

public class Boj_1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] list = new int[n][2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st2.nextToken());
            list[i][0] = temp;
            list[i][1] = i;
        }

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] n1, int[] n2) {
                return n1[0] - n2[0];
            }

        });

        int[] resultList = new int[n];
        int index = 0;
        String result = " ";
        for (int i = 0; i < n; i++) {
            resultList[list[i][1]] = index;
            index++;

        }
        for (int i = 0; i < n; i++) {
            result = result + resultList[i] + " ";

        }
        System.out.print(result.trim());
    }

}
