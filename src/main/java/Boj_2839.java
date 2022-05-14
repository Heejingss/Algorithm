import java.io.*;
import java.util.*;

public class Boj_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        if (n % 5 == 0) {
            result = n / 5;
        } else {
            result = result + n / 5;
            int remain = n % 5;
            boolean chk = true;

            if (remain % 3 == 0) {
                result = result + remain / 3;
            } else {
                while (result > 0) {
                    result--;
                    remain = remain + 5;
                    if (remain % 3 == 0) {
                        result = result + remain / 3;
                        chk = false;
                        break;
                    }
                }
                if (chk) {
                    result = -1;
                }

            }
        }
        bw.append(result + "");
        bw.flush();
        bw.close();
    }

}
