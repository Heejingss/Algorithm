import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_14606 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        int a = 0;

        int max = 0;
        if (n == 1) {
            bw.append(0 + "");
        } else if (n == 2) {
            bw.append(1 + "");
        } else {
            dp[1] = 0;
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <= i / 2; j++) {
                    if (max <= j * (i / 2 - j)) {
                        max = j * (i / 2 - j);
                        a = j;
                    }
                }
                dp[i] = dp[a] + dp[i - a] + a * (i - a);
            }

            bw.append(dp[n] + "");
        }
        bw.flush();
        bw.close();

    }

}
