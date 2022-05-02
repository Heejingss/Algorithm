import java.util.*;
import java.io.*;

public class Boj_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x = 0;
            if (str.equals("push")) {
                x = Integer.parseInt(st.nextToken());
            }

            if (str.equals("push")) {
                stack.push(x);
            } else if (str.equals("pop")) {
                if (stack.size() == 0) {
                    bw.append(-1 + "\n");
                } else {
                    bw.append(stack.pop() + "\n");
                }

            } else if (str.equals("size")) {
                bw.append(stack.size() + "\n");

            } else if (str.equals("empty")) {
                if (stack.size() == 0) {
                    bw.append(1 + "\n");
                } else {
                    bw.append(0 + "\n");
                }
            } else if (str.equals("top")) {
                if (stack.size() != 0) {
                    bw.append(stack.peek() + "\n");
                } else {
                    bw.append(-1 + "\n");
                }
            }

        }

        bw.flush();
        bw.close();
    }
}
