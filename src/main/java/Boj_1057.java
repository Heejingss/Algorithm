import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Boj_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int round = 1;
        while (true) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a / 2 + 1;
            }
            if (b % 2 == 0) {
                b = b / 2;
            } else {
                b = b / 2 + 1;
            }
            round++;
            if ((Math.abs(b - a) == 1) && (Math.max(a, b) % 2 == 0)) {
                break;
            }
            if (a == b) {
                round--;
                break;
            }
        }
        bw.append(round + "");
        bw.flush();
        bw.close();

    }
}
