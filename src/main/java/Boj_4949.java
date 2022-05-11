import java.io.*;
import java.util.*;

public class Boj_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        Stack<String> stack;

        while (true) {
            stack = new Stack<>();
            str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            String[] list = str.split("");
            boolean chk = true;

            for (int i = 0; i < list.length; i++) {
                if (list[i].equals("(")) {
                    stack.push("(");
                } else if (list[i].equals("[")) {
                    stack.push("[");
                } else if (list[i].equals(")")) {
                    if (stack.size() >= 1) {
                        if (stack.pop().equals("(")) {
                            continue;
                        } else {
                            chk = false;
                            break;
                        }
                    } else {
                        chk = false;
                        break;
                    }
                } else if (list[i].equals("]")) {
                    if (stack.size() >= 1) {
                        if (stack.pop().equals("[")) {
                            continue;
                        } else {
                            chk = false;
                            break;
                        }
                    } else {
                        chk = false;
                        break;
                    }
                }
            }
            if (chk && stack.size() == 0) {
                bw.append("yes\n");
            } else {
                bw.append("no\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
