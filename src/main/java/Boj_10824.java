import java.util.*;
import java.io.*;

public class Boj_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        a = a + st.nextToken();
        String c = st.nextToken();
        c = c + st.nextToken();
        // int a= Integer.parseInt(st.nextToken());
        // int b= Integer.parseInt(st.nextToken());
        // int c= Integer.parseInt(st.nextToken());
        // int d= Integer.parseInt(st.nextToken());

        bw.append(Long.parseLong(a) + Long.parseLong(c) + "");
        // bw.append(c);
        bw.flush();
        bw.close();

    }

}
