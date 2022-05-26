import java.util.*;
import java.io.*;

public class Boj_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] list = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        list[0] = 0;
        list[1] = Integer.parseInt(st.nextToken());
        for (int i = 2; i <= n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            list[i] = list[i - 1] + temp;
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.append(list[b] - list[a - 1] + "\n");
        }
        // for (int i = 0; i <= n; i++) {
        // System.out.println(list[i]);
        // }
        bw.flush();
        bw.close();
    }

}
