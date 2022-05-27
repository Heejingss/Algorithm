import java.util.*;
import java.io.*;

public class Boj_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        int max = list[0] * n;

        for (int i = 1; i < n; i++) {
            max = max > list[i] * (n - i) ? max : list[i] * (n - i);
        }
        bw.append(max + "");
        bw.flush();
        bw.close();
    }

}
