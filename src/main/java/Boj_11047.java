import java.util.*;
import java.io.*;

public class Boj_11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        int index = n - 1;
        int result = 0;
        while (sum != 0) {
            if (sum >= list[index]) {
                result = result + sum / list[index];
                sum = sum % list[index];
            }
            index--;
        }
        bw.append(result + "");
        bw.flush();
        bw.close();
        // System.out.println(result);
    }

}
