import java.util.*;
import java.io.*;

public class Boj_19947 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cash = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long[] dp = new long[n + 1];
        dp[0] = cash;

        for (int i = 1; i <= n; i++) {
            dp[i] = (int) Math.floor(dp[i - 1] * 1.05);
            if (i >= 3) {
                dp[i] = (int) Math.max((int) Math.floor(dp[i - 3] * 1.2), dp[i]);
            }
            if (i >= 5) {
                dp[i] = (int) Math.max((int) Math.floor(dp[i - 5] * 1.35), dp[i]);
            }
        }

        bw.append(dp[n] + "");
        bw.flush();
        bw.close();
    }

}
