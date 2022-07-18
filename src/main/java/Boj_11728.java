import java.util.*;
import java.io.*;

public class Boj_11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            list.add(Integer.parseInt(st.nextToken()));

        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            list.add(Integer.parseInt(st.nextToken()));

        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            bw.append(list.get(i) + " ");
        }

        bw.flush();
        bw.close();

    }
}
