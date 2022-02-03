
import java.io.*;
import java.util.*;

public class Boj_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        String[] arr1 = new String[count];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arr1[i] = st2.nextToken();
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int count2 = Integer.parseInt(st3.nextToken());
        String[] arr2 = new String[count2];
        StringTokenizer st4 = new StringTokenizer(br.readLine());
        String result = "";
        for (int i = 0; i < count2; i++) {
            arr2[i] = st4.nextToken();
            if (Arrays.asList(arr1).contains(arr2[i])) {
                result = result + "1\n";

            } else {
                result = result + "0\n";
            }

        }

        // for (int i = 0; i < count2; i++) {

        // if (Arrays.asList(arr1).contains(arr2[i])) {
        // System.out.println(1);

        // } else {
        // System.out.println(0);
        // }
        // }
        System.out.println(result.trim());
    }
}
