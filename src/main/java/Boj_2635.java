import java.util.*;
import java.io.*;

public class Boj_2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int max = 0;
        int start = 1;
        int n = num;
        int a = 1;
        int temp = 0;

        while (n >= a) {
            sb.append(n + " ");
            while (n - a >= 0) {
                sb.append(a + " ");
                temp = n;
                n = a;
                a = temp - a;
                count++;
            }
            sb.append(a + "\n");
            if (count > max) {
                max = count;
                result = new StringBuilder();
                result.append(count + 2 + "\n");
                result.append(sb);
            }
            sb = new StringBuilder();
            count = 0;
            start++;
            a = start;
            n = num;

        }
        bw.append(result);
        bw.flush();
        bw.close();
    }

}
