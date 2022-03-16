import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Boj_1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) {
            Boolean a = true;
            str = i + "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) - '0' != 4 && str.charAt(j) - '0' != 7) {
                    a = false;
                }
            }

            if (a) {
                System.out.println(str);
                break;
            }
        }
    }

}
