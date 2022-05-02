import java.util.*;
import java.io.*;

public class Boj_10866 {

    public static void main(String[] args) throws IOException, IllegalStateException, ClassCastException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> que = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] list = str.split(" ");
            if (list[0].equals("push_front")) {
                que.addFirst(Integer.parseInt(list[1]));
            } else if (list[0].equals("push_back")) {
                que.addLast(Integer.parseInt(list[1]));
            } else if (list[0].equals("pop_front")) {
                if (que.size() != 0) {
                    bw.append(que.pollFirst() + "\n");
                } else {
                    bw.append(-1 + "\n");
                }
            } else if (list[0].equals("pop_back")) {
                if (que.size() != 0) {
                    bw.append(que.pollLast() + "\n");
                } else {
                    bw.append(-1 + "\n");
                }
            } else if (list[0].equals("size")) {
                bw.append(que.size() + "\n");
            } else if (list[0].equals("empty")) {
                if (que.size() == 0) {
                    bw.append(1 + "\n");
                } else {
                    bw.append(0 + "\n");
                }

            } else if (list[0].equals("front")) {
                if (que.size() != 0) {
                    bw.append(que.peekFirst() + "\n");
                } else {
                    bw.append(-1 + "\n");
                }
            } else if (list[0].equals("back")) {
                if (que.size() != 0) {
                    bw.append(que.peekLast() + "\n");
                } else {
                    bw.append(-1 + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }

}
