import java.util.*;
import java.io.*;

public class Boj_1747 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[1004000];

        for (int i = 2; i < 1004000; i++) {
            if (list[i] == 0) {
                for (int j = 2; j * i < 1004000; j++) {
                    list[j * i] = 1;
                }
            }
        }
        if (n == 1) {
            bw.append(2 + "");
        } else {
            int j = 0;

            for (j = n; j < 1004000; j++) {
                if (list[j] == 0) {
                    int temp = j;
                    int z = 1;
                    while (temp / 10 >= 1) {
                        temp = temp / 10;
                        z++;
                    }

                    String str = j + "";

                    boolean chk = true;
                    for (int i = 0; i < z / 2; i++) {
                        if (str.charAt(i) != str.charAt(z - i - 1)) {
                            chk = false;
                        }
                    }
                    if (chk) {
                        break;
                    }

                }
            }
            bw.append(j + "");
        }

        bw.flush();
        bw.close();

    }

}
