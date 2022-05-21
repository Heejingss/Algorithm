import java.util.*;
import java.io.*;

public class Boj_11008 {
    static String s = "";
    static String p = "";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            s = st.nextToken();
            p = st.nextToken();
            bw.append(time(s, p) + "\n");

        }
        bw.flush();
        bw.close();
    }

    public static int time(String s, String p) {
        int count = 0;
        if (s.contains(p)) {
            String temp = s.replace(p, "");
            count = (s.length() - temp.length()) / p.length();
            count = count + temp.length();
        }
        return count;
    }

}
