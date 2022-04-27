import java.io.*;
import java.util.*;

public class Boj_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        // int[] list = new int[str.length()];
        Integer[] list = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            list[i] = str.charAt(i) - 48;
        }
        Arrays.sort(list, Collections.reverseOrder());

        if (list[str.length() - 1] == 0) {
            long sum = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                sum = sum + list[i];
            }
            if (sum % 3 != 0) {
                bw.append(-1 + "");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    bw.append(list[i] + "");
                }
            }
        } else {
            bw.append(-1 + "");
        }

        bw.flush();
        bw.close();
    }

}
