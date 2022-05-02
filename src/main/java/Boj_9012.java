import java.util.*;
import java.io.*;

public class Boj_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            stack = new Stack<>();
            int a = 0;
            if (str.length() % 2 != 0) {
                bw.append("NO\n");
            } else {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '(') {
                        stack.push('(');
                    } else if (str.charAt(j) == ')') {
                        if (stack.size() != 0) {
                            stack.pop();
                        } else {
                            a++;
                        }
                    }
                }
                if (stack.size() == 0 && a == 0) {
                    bw.append("YES\n");
                } else {
                    bw.append("NO\n");
                }
            }
            // bw.append(stack.toString());
        }

        bw.flush();
        bw.close();
    }

}
