import java.io.*;
import java.util.*;

public class Boj_1592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] list = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = 0;
        }
        list[1] = 1;
        int index = 1;
        if (m == 1) {
            bw.append(0 + "");
        } else {
            while (true) {
                if (list[index] % 2 != 0) {
                    index = index + l;
                    if (index > n) {
                        index = index - n;
                    }
                    list[index]++;
                    count++;
                    if (list[index] == m) {
                        break;
                    }
                } else {
                    index = index - l;
                    if (index < 1) {
                        index = index + n;
                    }
                    list[index]++;
                    count++;
                    if (list[index] == m) {
                        break;
                    }
                }

            }
            bw.append(count + "");
        }
        bw.flush();
        bw.close();
    }

}
