import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_3135 {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
            if (list[i] == end) {
                System.out.println(1);
                return;
            }
        }
        int min = Math.abs(start - end);

        for (int i = 0; i < n; i++) {
            if (Math.abs(list[i] - end) < min) {
                min = Math.abs(list[i] - end) + 1;
            }
        }
        System.out.println(min);

    }

}
