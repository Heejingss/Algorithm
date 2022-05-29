import java.util.*;
import java.io.*;

public class Boj_1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = str.length();

        String[] list = new String[3];
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                list[0] = str.substring(0, i);
                list[1] = str.substring(i, j);
                list[2] = str.substring(j, n);
                for (int k = list[0].length() - 1; k >= 0; k--) {
                    temp = temp + list[0].charAt(k);
                }
                for (int k = list[1].length() - 1; k >= 0; k--) {
                    temp = temp + list[1].charAt(k);
                }
                for (int k = list[2].length() - 1; k >= 0; k--) {
                    temp = temp + list[2].charAt(k);
                }
                result.add(temp);
                temp = "";
            }
        }

        Collections.sort(result);

        bw.append(result.get(0));
        bw.flush();
        bw.close();
    }

}
