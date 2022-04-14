import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_16208 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] list = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        long result = 0;
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            sum = sum + list[i];
        }
        Arrays.sort(list);
        for (int i = 0; i < n; i++) {
            result = result + list[i] * (sum - list[i]);
            sum = sum - list[i];
        }
        bw.append(result + "");
        bw.flush();
        bw.close();
    }

}
