
import java.util.*;
import java.io.*;

public class Boj_5355 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String result = "";
        for (int i = 0; i < n; i++) {
            // StringTokenizer inputSentence = new StringTokenizer(br.readLine());
            String st1 = br.readLine();
            String arr[] = st1.split(" ");
            float baseNum = Float.parseFloat(arr[0]);

            for (int j = 1; j < arr.length; j++) {

                if (arr[j].equals("@")) {
                    baseNum = baseNum * 3;
                } else if (arr[j].equals("%")) {
                    baseNum = baseNum + 5;
                } else if (arr[j].equals("#")) {
                    baseNum = baseNum - 7;
                }
            }

            result = result + String.format("%.2f", baseNum) + "\n";
        }

        System.out.println(result.trim());
    }
}
