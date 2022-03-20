import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<int[]> balloon = new ArrayDeque<>();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < n; i++) {
            balloon.add(new int[] { (i + 1), list[i] });
        }
        bw.append(1 + " ");
        int index = list[0];
        while (balloon.size() > 0) {
            if (index > 0) {
                for (int i = 1; i < index; i++) {
                    balloon.add(balloon.poll());
                }

                int[] nxt = balloon.poll();
                index = nxt[1];
                bw.append(nxt[0] + " ");
            } else {
                for (int i = 1; i < -index; i++) {
                    balloon.addFirst(balloon.pollLast());
                }

                int[] nxt = balloon.pollLast();
                index = nxt[1];
                bw.append(nxt[0] + " ");
            }
        }
        bw.flush();
        bw.close();
    }

}
