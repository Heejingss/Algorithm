import java.util.*;
import java.io.*;

public class Boj_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = list[0];
        if (n > 1) {
            dp[1] = list[0] + list[1];
            if (n > 2) {
                dp[2] = list[2] + Math.max(list[0], list[1]);
                for (int i = 3; i < n; i++) {
                    dp[i] = list[i] + Math.max(dp[i - 3] + list[i - 1], dp[i - 2]);
                }
            }
        }
        bw.append(dp[n - 1] + "");
        bw.flush();
        bw.close();

    }

}
