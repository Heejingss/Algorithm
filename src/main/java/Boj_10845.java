import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        int last = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x = 0;
            switch (str) {
                case "push":
                    x = Integer.parseInt(st.nextToken());
                    que.add(x);
                    last = x;
                    break;
                case "pop":
                    if (que.isEmpty()) {
                        bw.append(-1 + "\n");
                    } else {
                        bw.append(que.poll() + "\n");
                    }
                    break;
                case "size":
                    bw.append(que.size() + "\n");
                    break;
                case "empty":
                    if (que.isEmpty()) {
                        bw.append(1 + "\n");
                    } else {
                        bw.append(0 + "\n");
                    }
                    break;
                case "front":
                    if (que.isEmpty()) {
                        bw.append(-1 + "\n");
                    } else {
                        bw.append(que.peek() + "\n");
                    }
                    break;
                case "back":
                    if (que.isEmpty()) {
                        bw.append(-1 + "\n");
                    } else {
                        bw.append(last + "\n");
                    }
                    break;

            }

        }
        bw.flush();
        bw.close();
    }

}
