import java.util.*;
import java.io.*;

public class Boj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        int index = 0;
        int i = 1;
        while (index < n) {

            // System.out.println("hee" + i);
            // System.out.println("찾을 값:" + list[index]);
            // System.out.println(stack);
            if (stack.size() != 0 && stack.peek() == list[index]) {
                stack.pop();
                sb.append("-\n");
                // System.out.println("-");
                index++;
            } else if (stack.size() != 0 && stack.peek() > list[index]) {
                break;
            } else {
                while (i <= n) {
                    if (i != list[index]) {
                        stack.push(i);
                        sb.append("+\n");
                        i++;

                    } else {
                        stack.push(i);
                        sb.append("+\n");
                        i++;
                        break;
                    }
                }
            }

        }
        if (index == n) {
            bw.append(sb);
        } else {
            bw.append("NO");
        }

        bw.flush();
        bw.close();
    }

}
