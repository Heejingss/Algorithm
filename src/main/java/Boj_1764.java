import java.util.*;
import java.io.*;

public class Boj_1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        // String[] noHear = new String[num1];
        // String[] noSee = new String[num2];

        for (int i = 0; i < num1; i++) {
            set.add(br.readLine());
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < num2; i++) {
            String tmp = br.readLine();
            // if (Arrays.asList(noHear).contains(tmp)) { 이건 오래 걸리니 쓰지 말 것
            if (set.contains(tmp)) {
                resultList.add(tmp);

            }
        }

        Collections.sort(resultList);
        System.out.println(resultList.size());
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }

    }
}
