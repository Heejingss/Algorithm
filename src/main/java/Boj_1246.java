import java.io.*;
import java.util.*;

public class Boj_1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] list = new int[m];
        for (int i = 0; i < m; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        int maxsum = 0;
        int maxprice = 0;

        for (int i = 0; i < m; i++) {
            int price = list[i];
            int sum = 0;

            if (m - i < n) {
                sum = price * (m - i);
            } else {
                sum = price * n;
            }

            if (sum > maxsum) {
                maxsum = sum;
                maxprice = price;
            }
        }

        bw.append(maxprice + " " + maxsum);
        bw.flush();
        bw.close();

    }

}
