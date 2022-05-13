import java.io.*;
import java.util.*;

public class Boj_10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a != 0) {
                stack.push(a);
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }
        bw.append(sum + "");
        bw.flush();
        bw.close();

    }

}
