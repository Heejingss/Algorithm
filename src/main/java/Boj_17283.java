import java.io.*;
import java.util.*;

public class Boj_17283 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int ratio = Integer.parseInt(br.readLine());
        int result = 0;
        int base = 2;
        while (true) {
            int length = n * ratio / 100;
            if (length <= 5) {
                break;
            }
            n = length;
            result = result + base * length;
            base = base * 2;
        }
        bw.append(result + "");
        bw.flush();
        bw.close();
    }

}
