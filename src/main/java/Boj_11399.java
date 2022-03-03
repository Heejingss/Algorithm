import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Boj_11399 {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        long sum = 0;
        long tempsum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tempsum = tempsum + list[j];

            }
            System.out.println(tempsum);
            sum += tempsum;
            tempsum = 0;
        }
        System.out.println(sum);
    }

}
