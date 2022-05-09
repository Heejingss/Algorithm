import java.util.*;
import java.io.*;

public class Boj_1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] list = new int[b + 1];

        for (int i = 2; i < b + 1; i++) {
            if (list[i] == 0) {
                for (int j = 2; j * i < b + 1; j++) {
                    list[j * i] = 1;
                }
            }
        }
        if (a >= 2) {
            for (int i = a; i < b + 1; i++) {
                if (list[i] == 0) {
                    bw.append(i + "\n");
                }
            }
        } else if (a == 1) {
            for (int i = a + 1; i < b + 1; i++) {
                if (list[i] == 0) {
                    bw.append(i + "\n");
                }
            }
        }

        // for (int i = a; i <= b; i++) {
        // boolean chk = true;
        // for (int j = 2; j <= i / 2; j++) {
        // if (i % j == 0) {
        // chk = false;
        // break;
        // }
        // }
        // if (chk) {
        // bw.append(i + "\n");
        // }
        // }

        bw.flush();
        bw.close();
    }

}
