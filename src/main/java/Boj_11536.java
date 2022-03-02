import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Boj_11536 {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        String[] dicArr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            dicArr[i] = arr[i];
        }

        Arrays.sort(dicArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2); // 사전 순으로 정렬
            }
        });
        int count = 0;
        int oppositeCount = 0;
        if (arr[n - 1] == dicArr[0]) {
            for (int i = 1; i < n; i++) {
                if (arr[n - i - 1] == dicArr[i]) {
                    oppositeCount++;
                }
            }
        } else if (arr[0] == dicArr[0]) {
            for (int i = 1; i < n; i++) {
                if (arr[i] == dicArr[i]) {
                    count++;
                }
            }
        }
        if (count == n - 1) {
            System.out.println("INCREASING");
        } else if (oppositeCount == n - 1) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }

    }
}
