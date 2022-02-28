import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Boj_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        int[] alp = new int[26];
        int count = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) { // 각 단어에 대해서
            for (int k = 0; k < 26; k++) {
                alp[k] = 0;
            }
            alp[list[i].charAt(0) - 97]++; // 첫 알파벳 count
            for (int j = 1; j < list[i].length(); j++) { // 각 단어의 두번째 알파벳부터
                int index = list[i].charAt(j) - 97; // 두번째 알파벳 alp 배열에 넣기
                if ((alp[index] == 0) || (list[i].charAt(j - 1) == list[i].charAt(j))) { // 만약 첫번째로 세지거나 or 앞이랑 같은 경우
                    alp[index]++;
                    temp++;
                }
            }

            if (temp == list[i].length() - 1) {
                count++;
            }
            temp = 0;
        }

        System.out.println(count);
    }

}
