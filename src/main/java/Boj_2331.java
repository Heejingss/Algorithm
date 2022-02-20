import java.io.*;
import java.util.*;

public class Boj_2331 {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int multiple = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        list.add(num);
        while (true) {
            num = list.get(list.size() - 1);
            sum = 0;
            while (num != 0) {
                sum = sum + multiply(num % 10, multiple);
                // (int) Math.pow(num % 10, (double) multiple);
                num = num / 10;
            }
            if (list.contains(sum)) {
                int result = list.indexOf(sum);
                bw.write(result + "\n");
                break;
            }

            list.add(sum);
            // num = sum;
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static int multiply(int num, int k) {
        for (int i = 1; i < k; i++) {
            num = num * num;
        }
        return num;
    }
}
