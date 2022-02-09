import java.util.*;
import java.io.*;

public class Boj_11652 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] list = new long[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            list[i] = Long.parseLong(st2.nextToken());
        }

        Arrays.sort(list);

        int maxCount = 1;
        int tempCount = 1;
        long result = list[0];

        for (int i = 1; i < n; i++) {
            if (list[i] == list[i - 1]) {
                tempCount++;
            } else {
                tempCount = 1;
            }

            if (tempCount > maxCount) {
                maxCount = tempCount;
                result = list[i];
            }
        }

        System.out.println(result);
    }

}
