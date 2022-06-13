import java.util.*;
import java.io.*;

public class Boj_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            str = str.format("Case #%d: %d + %d = %d", i + 1, a, b, a + b);
            bw.append(str + "\n");
        }
        bw.flush();
        bw.close();
    }

}
