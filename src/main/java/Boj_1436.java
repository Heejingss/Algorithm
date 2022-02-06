
import java.io.*;
import java.util.*;

public class Boj_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        int n = 0;

        while (num > 0) {
            n++;

            if (String.valueOf(n).contains("666")) {
                num--;
            }
        }
        System.out.print(n);
    }

}
