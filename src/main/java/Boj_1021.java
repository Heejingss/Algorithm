import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Boj_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int all = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> mainlist = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < all; i++) {
            mainlist.add(i + 1);
        }
        st = new StringTokenizer(br.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int temp = mainlist.indexOf(list[i]);

            if (temp < mainlist.size() - temp) {
                for (int j = 0; j < temp; j++) {
                    mainlist.add(mainlist.remove(0));
                    count++;
                }
            } else if (temp >= mainlist.size() - temp) {
                for (int j = 0; j < mainlist.size() - temp; j++) {
                    mainlist.add(0, mainlist.remove(mainlist.size() - 1));
                    count++;
                }
            }
            mainlist.remove(0);

        }
        System.out.print(count);

    }

}
