import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.IOException;
import java.util.*;

public class Boj_2407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger[][] dp = new BigInteger[n + 1][n + 1];
        // long[][] dp = new long[n + 1][n + 1];
        dp[0][0] = BigInteger.ONE;

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < m; i++) {
            a = a.multiply(new BigInteger(String.valueOf(n - i)));
            b = b.multiply(new BigInteger(String.valueOf(i + 1)));
        }
        BigInteger result = a.divide(b);
        bw.append(result + "");
        bw.flush();
        bw.close();
    }

}
