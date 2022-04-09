import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Boj_5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
            list[i] = list[i] + list[i];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list[i].contains(str)) {
                count++;
            }
        }
        bw.append(count + "");
        bw.flush();
        bw.close();
    }

}
