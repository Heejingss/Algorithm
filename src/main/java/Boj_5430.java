import java.util.*;
import java.io.*;

public class Boj_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque;

        for (int i = 0; i < n; i++) {
            deque = new ArrayDeque<>();
            String str = br.readLine();
            int count = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            if (count == 0 && str == "D") {
                bw.append("error\n");
                continue;
            }
            if (count == 0 && str == "R") {
                bw.append("[]\n");
                continue;
            }
            arr = arr.substring(1, arr.length() - 1);
            String[] templist = arr.split(",");
            for (int j = 0; j < count; j++) {
                deque.add(Integer.parseInt(templist[j]));
            }
            boolean direction = true;
            boolean chk = true;
            for (int j = 0; j < str.length(); j++) {
                char x = str.charAt(j);
                if (x == 'R') {
                    direction = !direction;
                } else if (x == 'D') {
                    if (deque.size() >= 1) {
                        if (direction) {
                            deque.pollFirst();
                        } else {
                            deque.pollLast();
                        }
                    } else if (deque.size() == 0) {
                        bw.append("error\n");
                        chk = false;
                        break;
                    }
                }
            }
            if (deque.size() > 0) {
                bw.append("[");
                int size = deque.size() - 1;
                if (direction) {
                    for (int j = 0; j < size; j++) {
                        bw.append(deque.pollFirst() + ",");
                    }
                    bw.append(deque.pollFirst() + "]\n");
                } else {
                    for (int j = 0; j < size; j++) {
                        bw.append(deque.pollLast() + ",");
                    }
                    bw.append(deque.pollLast() + "]\n");

                }
            } else if (deque.size() == 0 && chk) {
                bw.append("[]\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
