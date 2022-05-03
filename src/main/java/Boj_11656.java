import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Boj_11656 {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] arr = new String[str.length()];
        // for (int i = str.length() - 1; i >= 0; i--) {
        // String temp = str.charAt(i) + "";
        // for (int j = i + 1; j < str.length(); j++) {
        // temp = temp + str.charAt(j);
        // }
        // arr[str.length() - i - 1] = temp;

        // }

        for (int i = 0; i < arr.length; i++) {
            String temp = str.substring(i, str.length());
            arr[i] = temp;
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2); // 사전 순으로 정렬
            }
        });

        for (int i = 0; i < arr.length; i++) {
            bw.append(arr[i] + "\n");
            // System.out.println(arr[i]);
        }

        bw.flush();
        bw.close();
    }
}
