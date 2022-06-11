import java.util.*;
import java.io.*;

public class Boj_1431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] list = new String[n][2];
        // list
        for (int i = 0; i < n; i++) {
            list[i][0] = br.readLine();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < list[i][0].length(); j++) {
                char temp = list[i][0].charAt(j);

                if (temp < 65 || temp > 90) {
                    sum = sum + temp - 48;
                }

            }
            list[i][1] = sum + "";
            sum = 0;
        }

        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                if (s1[0].length() != s2[0].length()) {
                    return s1[0].length() - s2[0].length();
                } else {
                    if (Integer.parseInt(s1[1]) != Integer.parseInt(s2[1])) {
                        return Integer.parseInt(s1[1]) - Integer.parseInt(s2[1]);
                    } else {
                        return s1[0].compareTo(s2[0]);
                    }
                }

            }
        });

        for (int i = 0; i < n; i++) {
            bw.append(list[i][0] + "\n");
        }

        bw.flush();
        bw.close();
    }

}
