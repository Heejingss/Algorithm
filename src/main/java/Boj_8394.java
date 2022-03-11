import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_8394 {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i - 1] % 10 + dp[i - 2] % 10) % 10;
        }

        System.out.println(dp[n - 1]);
    }

}
