import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long sum = 0;
        if (a * 2 < b) {
            sum = x * a + y * a;
        } else if (a > b) {

            if ((x + y) % 2 == 0) {
                sum = Math.max(x, y) * b;
            } else {
                sum = (Math.max(x, y) - 1) * b + a;
            }
        } else {
            if (x == y) {
                sum = x * b;
            } else {
                sum = Math.min(x * b, y * b) + Math.abs(x - y) * a;

            }
        }

        bw.append(sum + "");
        bw.flush();
        bw.close();
    }

}
