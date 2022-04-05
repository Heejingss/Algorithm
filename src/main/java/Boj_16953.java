import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int count = 1;
        while (b != a) {
            if ((b % 2 != 0 && b % 10 != 1) || (b < a)) {
                count = -1;
                break;
            }

            if (b % 2 == 0) {
                b = b / 2;
            } else {
                b = b / 10;
            }
            count++;

        }
        bw.append(count + "");
        bw.flush();
        bw.close();
    }

}
