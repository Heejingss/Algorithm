import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i - (j * j)] + 1, dp[i]);
            }
        }
        // int a = (int) Math.sqrt(n);
        //
        // while (a > 0) {
        // if (n >= a * a) {
        // n = n - a * a;
        // count++;
        // } else {
        // while (n < a * a) {
        // a--;
        // }
        // n = n - a * a;
        // count++;
        // }
        // if (n == 0) {
        // break;
        // }

        // }
        bw.append(dp[n] + "");
        bw.flush();
        bw.close();

    }

}
