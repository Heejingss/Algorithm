
import java.util.*;
import java.io.*;

public class Boj_10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String[][] nameList = new String[n][2];

        // BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            nameList[i][0] = st2.nextToken();
            nameList[i][1] = st2.nextToken();
            // sequence[i] = i;

        }
        Arrays.sort(nameList, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        // 순차정렬
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if ((ageList[i] > ageList[j]) || ((ageList[i] == ageList[j]) && (sequence[i]
        // > sequence[j]))) {
        // int temp = ageList[i];
        // ageList[i] = ageList[j];
        // ageList[j] = temp;

        // String tempStr = nameList[i];
        // nameList[i] = nameList[j];
        // nameList[j] = tempStr;

        // int temp2 = sequence[i];
        // sequence[i] = sequence[j];
        // sequence[j] = temp2;
        // }

        // }

        // }
        for (int i = 0; i < n; i++) {
            System.out.println(nameList[i][0] + " " + nameList[i][1]);

        }

    }

}
