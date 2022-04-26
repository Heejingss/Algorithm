import java.io.*;
import java.util.*;

public class Boj_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            list.add(temp);
            n = n / 10;
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            bw.append(list.get(i) + "");
        }
        bw.flush();
        bw.close();

    }
}
