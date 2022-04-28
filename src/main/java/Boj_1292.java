import java.io.*;
import java.util.*;

public class Boj_1292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] list = new int[b + 1];
        int[] sumList = new int[b + 1];
        list[0] = 1;
        int index = 1;
        int sum = 0;
        for (int i = 0; i <= b; i++) { // 숫자기준 1이라는 숫자를 한번
            for (int j = 1; j <= i; j++) { // 횟수 제어
                if (index > b) {
                    break;
                }
                list[index] = i;
                sum = sum + list[index];
                sumList[index] = sum;
                index++;
            }

        }
        System.out.println(sumList[b] - sumList[a - 1]);

    }

}
