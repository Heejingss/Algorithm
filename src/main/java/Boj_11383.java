import java.util.*;
import java.io.*;

public class Boj_11383 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        String[] list = new String[n];
        String[] list2 = new String[n];
        String result = "";
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            list2[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = 0; j < size; j++) {
                temp = temp + list[i].charAt(j) + list[i].charAt(j);
            }
            if (temp.equals(list2[i])) {
                result = "Eyfa";
            } else {
                result = "Not Eyfa";
                break;
            }

        }
        System.out.println(result);
    }
}