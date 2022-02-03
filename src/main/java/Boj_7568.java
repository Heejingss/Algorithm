
import java.util.*;
import java.io.*;

public class Boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        ArrayList<int[]> bodyList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int temparr[] = { weight, height };
            bodyList.add(temparr);
        }

        for (int i = 0; i < count; i++) {
            System.out.print(bodyList.get(i)[0]);
            System.out.println(bodyList.get(i)[1]);
        }

    }

}
