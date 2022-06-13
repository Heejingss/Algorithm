import java.util.*;
import java.io.*;

public class Boj_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (c - b <= 0) {
            bw.append(-1 + " ");
        } else {
            int result = a / (c - b);
            result++;
            bw.append(result + "");
        }

        bw.flush();
        bw.close();

    }
}
