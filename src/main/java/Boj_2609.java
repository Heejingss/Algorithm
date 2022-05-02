import java.util.*;
import java.io.*;

public class Boj_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a != b) {
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int end = max / 2 >= min ? min : max / 2;
            int base = 0;
            for (int i = 1; i <= end; i++) {
                if (a % i == 0 && b % i == 0) {
                    base = i;
                }
            }
            bw.append(base + "\n");
            bw.append((a / base) * b + "");
        } else {
            bw.append(a + "\n");
            bw.append(a + "");
        }
        bw.flush();
        bw.close();
    }

}
