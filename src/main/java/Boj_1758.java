import java.io.*;
import java.util.*;

public class Boj_1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Integer[] list = new Integer[n];
        long tip = 0;

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (list[i] - i >= 0) {
                tip = tip + list[i] - i;
            }
        }
        bw.append(tip + "");
        bw.flush();
        bw.close();
    }

}
