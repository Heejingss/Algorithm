import java.util.*;
import java.io.*;

public class Boj_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.append((a + b) % c + "\n");
        bw.append(((a % c) + (b % c)) % c + "\n");
        bw.append((a * b) % c + "\n");
        bw.append(((a % c) * (b % c)) % c + "\n");

        bw.flush();
        bw.close();
    }

}
