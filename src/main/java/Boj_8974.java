import java.util.*;
import java.io.*;

public class Boj_8974 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] list = new int[b + 1];
        int temp = b;
        int max = 1;
        int index = 1;
        int sum = 0;

        while (temp > 0) {
            temp = temp - max;
            max++;
        }

        for (int i = 1; i < max; i++) {
            int count = 0;
            while (count != i && index < b + 1) {
                list[index++] = i;
                count++;
            }
        }

        for (int i = a; i <= b; i++) {
            sum = sum + list[i];
        }
        bw.append(sum + "");
        bw.flush();
        bw.close();
    }

}
