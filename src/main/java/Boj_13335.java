import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        int[] truck = new int[w]; // 다리 위에 있는 트럭
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        int time = 0;
        truck[0] = list[0];
        time++;
        int index = 1;

        while (index < n) {
            int temp = 0;
            for (int j = w - 1; j > 0; j--) {
                truck[j] = truck[j - 1];
            }
            truck[0] = 0;
            time++;
            for (int j = 0; j < w; j++) {
                temp = temp + truck[j];
            } // 올라가있는 트럭들

            if (temp + list[index] <= L) {
                truck[0] = list[index++];
            }

        }
        time = time + w;
        bw.append(time + " ");
        bw.flush();
        bw.close();
    }

}
