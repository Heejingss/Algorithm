import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[9];
        int[] b = new int[9];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int suma = 0;
        int sumb = 0;
        boolean win = false;
        for (int i = 0; i < 9; i++) {
            suma = suma + a[i];
            if (suma > sumb) {
                win = true;
            }
            sumb = sumb + b[i];
        }
        if (win) {
            bw.append("Yes");
        } else {
            bw.append("No");
        }

        bw.flush();
        bw.close();
    }

}
