import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_11256 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int box = Integer.parseInt(st.nextToken());
            int[] list = new int[box];
            for (int j = 0; j < box; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list[j] = x * y;
            }
            Arrays.sort(list);
            int count = 0;
            int index = list.length - 1;
            while (candy > 0) {
                candy = candy - list[index];
                count++;
                index--;

            }
            bw.append(count + "\n");

        }
        bw.flush();
        bw.close();
    }

}
