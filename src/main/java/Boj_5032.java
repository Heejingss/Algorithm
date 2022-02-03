
import java.io.*;
import java.util.*;

public class Boj_5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int count = num1 + num2;

        int result = 0;
        int portion = 0;
        int remain = 0;

        while (count >= num3) {
            portion = count / num3;
            remain = count % num3;
            result = result + portion;
            count = portion + remain;
        }
        System.out.println(result);

    }
}
