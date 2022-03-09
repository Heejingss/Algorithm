import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_14468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int pair = 0;
        int pos1[] = new int[26];
        int pos2[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'A'; // 어떤 알파벳인지
            if (pos1[idx] == 0) { // 이 알파벳이 처음 나온거면
                pos1[idx] = i + 1;
            } else { // 이미 출발했고 도착 알파벳이면
                pos2[idx] = i + 1;
            }
        }
        for (int i = 0; i < str.length() / 2; i++) {
            for (int j = 0; j < str.length() / 2; j++) {
                if (pos1[i] < pos1[j] && pos1[j] < pos2[i] && pos2[i] < pos2[j]) {
                    pair++;
                }
            }
        }

        System.out.println(pair);

    }
}
