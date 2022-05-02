import java.util.*;
import java.io.*;

public class Boj_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= a; i++) {
            que.add(i);
        }
        bw.append("<");
        while (que.size() > 1) {
            for (int i = 0; i < b - 1; i++) {
                que.add(que.poll());
            }
            bw.append(que.poll() + ", ");
            // System.out.println(que);
        }
        bw.append(que.poll() + ">");
        bw.flush();
        bw.close();
    }

}
