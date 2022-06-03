import java.util.*;
import java.io.*;

public class Boj_1003 {
    static int[][] list = new int[41][2];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        list[0][0] = 1;
        list[1][1] = 1;
        for (int i = 0; i < n; i++) {
            map.put(0, 0);
            map.put(1, 0);
            int a = Integer.parseInt(br.readLine());
            // list = new int[a + 1];
            fibonacci(a);
            // System.out.println(map);
            bw.append(list[a][0] + " " + list[a][1] + "\n");
            // bw.append(map.get(0) + " " + map.get(1) + "\n");
        }
        bw.flush();
        bw.close();

    }

    public static void fibonacci(int a) throws IOException, NumberFormatException {

        if (a == 0) {
            list[0][0] = 1;
            list[0][1] = 0;
            // map.put(0, map.get(0) + 1);
            // return 0;
        } else if (a == 1) {
            list[1][0] = 0;
            list[1][1] = 1;
            // map.put(1, map.get(1) + 1);
            // return 1;
        } else {
            fibonacci(a - 1);
            list[a][0] = list[a - 1][0] + list[a - 2][0];
            list[a][1] = list[a - 1][1] + list[a - 2][1];
            // return list[a];
        }

    }

}
