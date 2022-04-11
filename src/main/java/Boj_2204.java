import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) {
                String[][] list = new String[n][2];
                for (int i = 0; i < n; i++) {
                    list[i][0] = br.readLine();
                    list[i][1] = list[i][0].toUpperCase();
                }
                Arrays.sort(list, new Comparator<String[]>() {
                    @Override
                    public int compare(String[] s1, String[] s2) {
                        return s1[1].compareTo(s2[1]);
                    }
                });

                bw.append(list[0][0] + "\n");

            } else if (n == 0) {
                break;
            }

        }
        bw.flush();
        bw.close();
    }

}
