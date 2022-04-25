import java.io.*;
import java.util.*;

public class Boj_14655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] maxList = new int[n];
        int[] minList = new int[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            maxList[i] = Integer.parseInt(st.nextToken());
            max = max + Math.abs(maxList[i]);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            minList[i] = Integer.parseInt(st.nextToken());
            min = min - Math.abs(maxList[i]);
        }

        bw.append(max - min + "");
        bw.flush();
        bw.close();

    }

}
