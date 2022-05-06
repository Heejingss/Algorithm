import java.util.*;
import java.io.*;

public class Boj_2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + list[i];
        }

        bw.append(sum - (n - 1) + "");
        bw.flush();
        bw.close();
    }

}
