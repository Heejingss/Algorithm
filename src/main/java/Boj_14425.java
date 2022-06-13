import java.util.*;
import java.io.*;

public class Boj_14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[] list = new String[b];
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < a; i++) {
            set.add(br.readLine());

        }

        for (int i = 0; i < b; i++) {
            list[i] = br.readLine();
        }

        for (int i = 0; i < b; i++) {
            if (set.contains(list[i]))
                count++;
        }

        bw.append(count + " ");
        bw.flush();
        bw.close();
    }

}
