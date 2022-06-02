import java.util.*;
import java.io.*;

public class Boj_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> namemap = new HashMap<>();
        HashMap<Integer, String> numbermap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            namemap.put(temp, i + 1);
            numbermap.put(i + 1, temp);
        }

        for (int i = 0; i < q; i++) {
            String temp = br.readLine();
            int x = 0;
            if (isStringDouble(temp)) {
                x = Integer.parseInt(temp);
                bw.append(numbermap.get(x) + "\n");
            } else {
                bw.append(namemap.get(temp) + "\n");
            }
        }

        bw.flush();
        bw.close();

    }

    public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
