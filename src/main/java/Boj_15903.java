import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] list = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);
        long temp = 0;
        for (int i = 0; i < m; i++) {
            temp = list[0] + list[1];
            list[0] = temp;
            list[1] = temp;
            Arrays.sort(list);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + list[i];
        }
        bw.append(sum + "");
        bw.flush();
        bw.close();
    }

}
