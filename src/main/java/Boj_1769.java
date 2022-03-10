import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_1769 {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();

        long sum = 0;
        int count = 0;

        while (true) {
            if (n.length() <= 1) {
                break;
            }
            for (int i = 0; i < n.length(); i++) {
                sum = sum + Integer.parseInt(String.valueOf(n.charAt(i)));
            }

            n = String.valueOf(sum);
            sum = 0;
            count++;
        }

        bw.append(count + "\n");

        if (Integer.parseInt(n) == 3 || Integer.parseInt(n) == 6 || Integer.parseInt(n) == 9) {
            bw.append("YES");
        } else {
            bw.append("NO");
        }
        bw.flush();
        bw.close();

        // int n = Integer.parseInt(br.readLine());
        // long sum = 0;
        // int count = 0;

        // while (true) {
        // if (n < 10) {
        // break;
        // }
        // while (n > 0) {
        // sum = sum + n % 10;
        // n = n / 10;
        // }
        // n = (int) sum;
        // sum = 0;
        // count++;
        // }
    }
}
