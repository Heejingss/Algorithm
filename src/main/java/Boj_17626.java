import java.util.*;
import java.io.*;

public class Boj_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n + 1];
        list[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (Math.sqrt(i) - (int) Math.sqrt(i) == 0) {
                list[i] = 1;
            } else {
                list[i] = i;
                for (int j = (int) Math.sqrt(i); j > 0; j--) {
                    int temp = i - j * j;
                    list[i] = Math.min(list[i], list[temp] + 1);
                }
            }
        }
        bw.append(list[n] + "");
        bw.flush();
        bw.close();
    }

}
