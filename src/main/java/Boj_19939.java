import java.io.*;
import java.util.*;

public class Boj_19939 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int all = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        all = all - sum;

        if (all >= 0) {
            if (all % n != 0) {
                System.out.println(n);
            } else {
                System.out.println(n - 1);
            }

        } else if (all < 0) {
            System.out.println(-1);
        }

    }

}
