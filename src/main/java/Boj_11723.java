import java.util.*;
import java.io.*;

public class Boj_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int a = 0;
            if (str.equals("add")) {
                a = Integer.parseInt(st.nextToken());
                set.add(a);
            } else if (str.equals("remove")) {
                a = Integer.parseInt(st.nextToken());
                set.remove(a);
            } else if (str.equals("check")) {
                a = Integer.parseInt(st.nextToken());
                if (set.contains(a)) {
                    bw.append(1 + "\n");
                } else {
                    bw.append(0 + "\n");
                }
            } else if (str.equals("toggle")) {
                a = Integer.parseInt(st.nextToken());
                if (set.contains(a)) {
                    set.remove(a);
                } else {
                    set.add(a);
                }
            } else if (str.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (str.equals("empty")) {
                set.clear();
            }
        }

        bw.flush();
        bw.close();
    }
}
