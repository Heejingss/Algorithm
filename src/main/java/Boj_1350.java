import java.io.*;
import java.util.*;

public class Boj_1350 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int size = Integer.parseInt(br.readLine());
        long result = 0;
        for (int i = 0; i < n; i++) {
            if (list[i] == 0) {
                continue;
            }
            result = result + list[i] / size;
            if (list[i] % size != 0) {
                result++;
            }
        }

        bw.append(result * size + "");
        bw.flush();
        bw.close();

    }

}
