import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Boj_3568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String type = st.nextToken();
            list.add(type);
        }

        for (int i = 1; i < list.size(); i++) { // 각 변수들에 대해
            String temp = list.get(0);
            int index = 0;
            for (int j = list.get(i).length() - 2; j >= 0; j--) { // 각 글자에 대해
                char cht = list.get(i).charAt(j);
                if (cht == ']') {
                    temp = temp + "[]";
                    j--;
                } else if (cht == '*' || cht == '&') {
                    temp = temp + cht;
                } else {
                    index = j;
                    break;
                }
            }
            temp = temp + " ";
            for (int j = 0; j <= index; j++) {
                temp = temp + list.get(i).charAt(j);
            }
            temp = temp + ";";

            bw.append(temp + "\n");
        }
        bw.flush();
        bw.close();
    }

}
