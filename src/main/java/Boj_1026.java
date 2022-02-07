import java.io.*;
import java.util.*;

public class Boj_1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            list1.add(Integer.parseInt(st2.nextToken()));
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            list2.add(Integer.parseInt(st3.nextToken()));
        }
        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + list1.get(i) * list2.get(i);

        }
        System.out.print(sum);
        // for (int i = 0; i < n; i++) {

        // System.out.print(list2.get(i));
        // }

    }

}
