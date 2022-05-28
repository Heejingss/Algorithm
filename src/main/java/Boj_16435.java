import java.util.*;
import java.io.*;

public class Boj_16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);

        for (int i = 0; i < n; i++) {
            if (height >= list[i]) {
                height++;
            }
        }

        bw.append(height + "");
        bw.flush();
        bw.close();
    }

}
