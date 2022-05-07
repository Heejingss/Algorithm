import java.util.*;
import java.io.*;

public class Boj_9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // 돌게임 규칙 찾기
        // n=1 일때 부터 완벽게임 전부 케이스 분리
        if (n % 2 == 0) {
            bw.append("SK");
        } else {
            bw.append("CY");
        }

        bw.flush();
        bw.close();
    }

}
