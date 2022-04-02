import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;

        int x = 1;
        while (true) {
            if (x > n) {
                break;
            }
            int temp = 0;
            temp = n / x;
            sum = sum + temp * x;
            x++;
        }

        bw.append(sum + " ");
        bw.flush();
        bw.close();

    }

}
