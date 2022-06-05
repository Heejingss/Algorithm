import java.util.*;
import java.io.*;

public class Boj_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int[][] list = new int[n][3];
        int[] list = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortNums = list.clone();
        Arrays.sort(sortNums);

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (!map2.containsKey(sortNums[i]))
                map2.put(sortNums[i], idx++);
            // map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }

        // System.out.println(map);
        // System.out.println(map2);

        for (int i = 0; i < n; i++) {
            bw.append(map2.get(list[i]) + " ");
        }

        bw.flush();
        bw.close();
    }

}
