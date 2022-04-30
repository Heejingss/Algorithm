import java.io.*;
import java.util.*;

public class Boj_13301 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // long n=Long.parseLong(br.readLine());
        long[] pi = new long[n + 1];

        pi[0] = 1;
        pi[1] = 1;

        for (int i = 2; i <= n; i++) {
            pi[i] = pi[i - 1] + pi[i - 2];
        }

        bw.append((pi[n] + pi[n - 1]) * 2 + "");
        bw.flush();
        bw.close();

    }

}
