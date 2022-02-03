
import java.io.*;
import java.util.*;

public class Boj_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        String arr[] = score.split(" ");
        String num1 = arr[0];
        String num2 = arr[1];
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int num1 = Integer.parseInt(st.nextToken());
        // int num2 = Integer.parseInt(st.nextToken());

        int num3 = Rev(num1) + Rev(num2);
        System.out.println(Rev(num3 + ""));

    }

    public static int Rev(String x) {
        String temp = "";
        for (int i = x.length() - 1; i >= 0; i--)
            temp = temp + x.charAt(i);
        return Integer.parseInt(temp);

    }
}
