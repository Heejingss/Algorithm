import java.util.*;
import java.io.*;

public class Boj_1110 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());
        int temp = n;
        int a = 0;
        int b = 0;
        while (true) {
            a = temp / 10;
            b = temp % 10;
            if (a + b >= 10) {
                temp = b * 10 + (a + b) % 10;
            } else {
                temp = b * 10 + a + b;
            }
            count++;
            if (temp == n) {
                break;
            }
        }
        System.out.println(count);
    }

}
