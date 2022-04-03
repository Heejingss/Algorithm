import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[11];
        list[1] = 1;
        list[2] = 2;
        list[3] = 4;
        for (int i = 4; i < 11; i++) {
            list[i] = list[i - 1] + list[i - 2] + list[i - 3];
        }

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            bw.append(list[a] + "\n");
        }

        bw.flush();
        bw.close();

    }

}
