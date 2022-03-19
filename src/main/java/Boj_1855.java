import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_1855 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int b = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = str.length() / b;
        char[][] list = new char[a][b];
        int index = 0;
        boolean reverse = true;
        for (int i = 0; i < a; i++) {
            if (reverse) {
                for (int j = 0; j < b; j++) {
                    list[i][j] = str.charAt(index++);

                }
                reverse = false;
            } else {
                for (int j = b - 1; j >= 0; j--) {
                    list[i][j] = str.charAt(index++);

                }
                reverse = true;
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                bw.append(list[j][i]);
            }
        }
        bw.flush();
        bw.close();
    }

}
