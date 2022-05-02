import java.util.*;
import java.io.*;

public class Boj_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] list = new int[a + 1];
        list[0] = 1;
        list[1] = 1;
        for (int i = 2; i <= a; i++) {
            list[i] = list[i - 1] * i;
        }
        bw.append(list[a] / (list[a - b] * list[b]) + "");
        bw.flush();
        bw.close();

    }

}
