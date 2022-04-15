import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n;
        while ((n = br.readLine()) != null) {
            // while (sc.hasNextInt()) {
            int a = Integer.parseInt(n);
            // int a = sc.nextInt();
            int mod = 1;
            int count = 1;
            while (true) {
                if (a == 1) {
                    bw.append(1 + "\n");
                    break;
                }
                mod = (mod * 10 + 1) % a;
                count++;
                if (mod == 0) {
                    bw.append(count + "\n");
                    break;
                }

            }
        }
        bw.flush();
        bw.close();

    }

}
