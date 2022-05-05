import java.util.*;
import java.io.*;

public class Boj_16673 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        long sum = 0;

        for (int i = 1; i <= c; i++) {
            sum = sum + k * i + p * i * i;
        }

        bw.append(sum + "");
        bw.flush();
        bw.close();

    }

}
