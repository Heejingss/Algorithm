import java.io.*;
import java.util.*;

public class Boj_1789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        long a = 0;
        long sum = 0;

        while (true) {
            sum = sum + a;
            a++;
            if (sum > n) {
                break;
            }
        }

        System.out.println(a - 2);
    }

}
