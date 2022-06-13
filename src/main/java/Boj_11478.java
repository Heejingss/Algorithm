import java.util.*;
import java.io.*;

public class Boj_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int length = 1;
        int n = str.length();
        HashSet<String> set = new HashSet<>();

        while (length <= n) {
            for (int i = 0; i <= n - length; i++) {
                set.add(str.substring(i, i + length));
            }
            length++;
        }

        bw.append(set.size() + "");
        bw.flush();
        bw.close();

    }

}
