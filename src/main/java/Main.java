import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        int min = list[0];
        int max = list[0];

        for (int i = 1; i < n; i++) {
            if (list[i] > max) {
                max = list[i];
            } else if (list[i] < min) {
                min = list[i];
            }
        }
        bw.append(min + " ");
        bw.append(max + "");

        bw.flush();
        bw.close();

    }

}
