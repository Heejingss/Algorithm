import java.util.*;
import java.io.*;

public class Boj_3036 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int base = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            bw.append(findDivider(base, a) + "\n");
        }

        bw.flush();
        bw.close();

    }

    public static String findDivider(int base, int a) {
        int max = base > a ? base : a;
        int divider = 0;
        if (base == a) {
            return "1/1";
        } else {
            for (int i = 1; i <= max / 2; i++) {
                if (base % i == 0 && a % i == 0) {
                    divider = i;

                }
            }
            return base / divider + "/" + a / divider;
        }
    }
}
