import java.io.*;
import java.util.*;

public class Boj_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        int interval = 1000000000;
        list[0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
            if (Math.abs(list[i] - list[i - 1]) <= interval) {
                interval = Math.abs(list[i] - list[i - 1]);
            }
        }

        int count = 0;
        boolean chk;

        while (interval > 0) {
            count = 0;
            chk = true;
            for (int i = 1; i < n; i++) {
                if (Math.abs(list[i] - list[i - 1]) % interval == 0) {
                    count = count + Math.abs(list[i] - list[i - 1]) / interval - 1;
                } else {
                    chk = false;
                    interval--;
                    break;
                }
            }
            if (chk) {
                break;
            }
        }

        bw.append(count + "");
        bw.flush();
        bw.close();
    }

}
