import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;
        if (a == b && b == c) {
            sum = 10000 + a * 1000;
        } else {
            if (a == b) {
                sum = 1000 + a * 100;
            } else if (b == c) {
                sum = 1000 + b * 100;
            } else if (a == c) {
                sum = 1000 + a * 100;
            } else {
                int max = a;
                if (max < b) {
                    max = b;
                }
                if (max < c) {
                    max = c;
                }
                sum = max * 100;
            }
        }

        bw.append(sum + "");
        bw.flush();
        bw.close();
    }

}
