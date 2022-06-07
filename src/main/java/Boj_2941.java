import java.util.*;
import java.io.*;

public class Boj_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] list = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        for (int i = 0; i < 8; i++) {
            if (str.contains(list[i])) {
                str = str.replaceAll(list[i], "*");
            }

        }
        bw.append(str.length() + "");
        bw.flush();
        bw.close();

    }

}
