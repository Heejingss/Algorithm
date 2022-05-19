import java.util.*;
import java.io.*;

public class Boj_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        if (n == 1) {
            bw.append(1 + " ");
        } else {
            n = n - 1;
            while (true) {
                n = n - 6 * i;
                i++;
                if (n <= 0) {
                    break;
                }
            }
            bw.append(i + " ");
        }
        bw.flush();
        bw.close();

    }

}
