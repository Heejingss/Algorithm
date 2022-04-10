import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.io.IOException;
import java.util.*;

public class Boj_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        while (true) {
            String str = br.readLine();
            if (str == null || str.length() == 0 || str.isEmpty()) {
                break;
            } else {
                map.put(str, map.getOrDefault(str, 0) + 1);
                count++;
            }
        }
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        for (int i = 0; i < keys.length; i++) {
            String keyStr = (String) keys[i];
            int n = map.get(keyStr);
            double per = (double) (n * 100.0) / count;
            bw.append(keyStr + " " + String.format("%.4f", per) + "\n");

        }
        bw.flush();
        bw.close();

    }

}
