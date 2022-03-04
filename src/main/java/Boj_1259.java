import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_1259 {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            bw.append(palindrome(str) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static String palindrome(String a) {
        int length = a.length();
        boolean check = true;
        for (int i = 0; i < length / 2; i++) {
            if (a.charAt(i) == a.charAt(length - i - 1)) {
                continue;
            } else {
                check = false;
            }
        }
        if (check) {
            return "yes";
        } else {
            return "no";
        }

    }

}
