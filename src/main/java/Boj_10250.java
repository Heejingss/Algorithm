import java.util.*;
import java.io.*;

public class Boj_10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int room = p / a; // 룸 넘버 1
            int floor = p % a; // 층수 4
            if (floor == 0) {
                floor = a;
                room = room - 1;
            }
            // bw.append(floor + "층," + room + "호\n");
            // System.out.print(floor * 100 + room + 1 + "\n");
            bw.append(floor * 100 + room + 1 + "\n");

        }
        bw.flush();
        bw.close();
    }

}
