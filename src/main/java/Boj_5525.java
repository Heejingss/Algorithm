import java.util.*;
import java.io.*;

public class Boj_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");

        int[] list = new int[m];
        int index = 0;
        for (int i = 0; i < m; ++i) {
            if (str[i].equals("I")) {
                list[index] = i;
                index++;
            }
        }
        int count = 0;
        int answer = 0;
        for (int i = 1; i < index; ++i) {
            if (list[i] - list[i - 1] == 2) {
                count++;
            } else {
                count = 0;
            }
            if (count >= a) {
                answer++;
            }
        }
        bw.append(answer + " ");
        bw.flush();
        bw.close();

        // 시간초과
        // String s = "I";
        // String temp = "";
        // int count = 0;
        // int length = a * 2 + 1;
        // for (int i = 0; i < a; i++) {
        // s = s + "OI";
        // }
        // if (str.contains(s)) {
        // for (int i = 0; i <= m - length; i++) {
        // temp = str.substring(i, i + length);
        // if (temp.equals(s)) {
        // count++;
        // }
        // }
        // bw.append(count + "");
        // } else {
        // bw.append(0 + "");
        // }

    }
}
