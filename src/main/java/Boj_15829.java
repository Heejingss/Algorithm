import java.io.*;
import java.util.*;

public class Boj_15829 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        for (int i = 0; i < n; i++) {
            int temp = str.charAt(i) - 97;
            long base = 1;
            for (int j = 0; j < i; j++) {
                base = (31 * base) % 1234567891;
            }
            result = result + base * (temp + 1);

        }
        bw.append(result % 1234567891 + "");
        bw.flush();
        bw.close();
    }

}
