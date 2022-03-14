import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Boj_1740 {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long threeN = 1;
        long result = 0;

        while (n > 0) {

            if (n % 2 == 1) {
                result = result + (n % 2) * threeN;
                threeN = 3 * threeN;
            } else {
                threeN = 3 * threeN;
            }

            n = n / 2;

        }
        System.out.println(result);

    }

}
