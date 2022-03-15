import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long sum = 0L;
        for (int i = 1; i < n; i++) {
            sum = sum + i * (n + 1);
        }

        bw.append(sum + " ");
        bw.flush();
        bw.close();
    }

}
