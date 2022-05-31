import java.util.*;
import java.io.*;

public class Boj_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            HashSet<String> set = new HashSet<>();
            HashMap<String, ArrayList> map = new HashMap<>();
            String[][] list = new String[m][2];
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                String clothe = st.nextToken();
                String type = st.nextToken();
                list[j][0] = type;
                list[j][1] = clothe;
                set.add(type);
            }
            int count = set.size();
            ArrayList<String> alist = new ArrayList<>(set);

            for (int j = 0; j < count; j++) {
                String base = alist.get(j);
                ArrayList<String> temp = new ArrayList<>();
                for (int k = 0; k < m; k++) {
                    if (base.equals(list[k][0])) {
                        temp.add(list[k][1]);
                    }
                }
                map.put(base, temp);
            }

            if (map.size() == 1) {
                bw.append(m + "\n");
            } else {
                int answer = 1;
                for (int j = 0; j < count; j++) {
                    String base = alist.get(j);
                    answer = answer * (map.get(base).size() + 1);
                }
                bw.append(answer - 1 + "\n");
            }
        }
        bw.flush();
        bw.close();

    }

}
