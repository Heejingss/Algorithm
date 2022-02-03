
import java.io.*;
import java.util.*;

public class Boj_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int days = 0;
        int height = num3 - num2;

        if (height % (num1 - num2) == 0) {
            days = height / (num1 - num2);
        } else {
            days = height / (num1 - num2) + 1;
        }

        // for (;;) {
        // if (num1 >= num3) { // 하루만에 올라가는 경우
        // break;
        // }

        // // 하루만에 못 올라가면, 현재 위치를 체크하기
        // height = height + num1; // 낮 되면 올라가기
        // days++;
        // if (height >= num3) { // 정상 도달
        // break;
        // } else { // 미끄러짐
        // height = height - num2;
        // }
        // }

        System.out.println(days);
    }

}
