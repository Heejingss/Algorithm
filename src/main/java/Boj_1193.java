import java.util.*;
import java.io.*;

public class Boj_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int index = 1;

        while (n - index > 0) {
            n = n - index;
            index++;
        }

        int temp = index + 1;

        if (index % 2 != 0) {
            for (int i = 0; i < n - 1; i++) {
                index--;
            }

            bw.append(index + "/" + (temp - index));
        } else {
            index = 1;
            for (int i = 0; i < n - 1; i++) {
                index++;
            }
            bw.append(index + "/" + (temp - index));
        }
        bw.flush();
        bw.close();
    }

}
