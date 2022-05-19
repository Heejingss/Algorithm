import java.util.*;
import java.io.*;

public class Boj_2858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int red = Integer.parseInt(st.nextToken());
        int brown = Integer.parseInt(st.nextToken());
        int sum = red + brown;
        int a = 0;
        int b = 0;
        for (int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0) {
                a = i;
                b = sum / i;
                if ((a + b - 2) * 2 == red && (a - 2) * (b - 2) == brown) {
                    break;
                }
            }
        }
        bw.append(Math.max(a, b) + " " + Math.min(a, b));

        bw.flush();
        bw.close();
    }
}
