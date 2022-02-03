
import java.io.*;
import java.util.*;

public class Boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] Josephus = new int[n];
        int index = 0;
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        String answer = "<";

        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    // sb.append(q.poll() + ", ");
                    Josephus[index] = q.poll();
                    index = index + 1;
                } else {
                    q.add(q.poll());
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            answer = answer + Josephus[i] + ", ";

        }
        System.out.println(answer + Josephus[n - 1] + ">");

        // bw.write((sb.substring(0, sb.length() - 2) + ">").toString());
        // bw.flush();
        // bw.close();
    }
}
