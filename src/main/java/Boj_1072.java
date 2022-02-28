import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long total = Integer.parseInt(st.nextToken());
        long win = Integer.parseInt(st.nextToken());
        long per = win * 100 / total;

        if (per >= 99) {
            System.out.println(-1);
            return;
        }
        long left = 1;
        long right = total;
        long tempPer = 0;
        long mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            tempPer = (mid + win) * 100 / (mid + total);
            if (tempPer >= (per + 1)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);

    }

}
