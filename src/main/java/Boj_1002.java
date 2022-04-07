import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Boj_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
            bw.append(place(x1, y1, d1, x2, y2, d2) + "\n");
        }
        bw.flush();
        bw.close();
    }

    static public int place(int x1, int y1, int d1, int x2, int y2, int d2) {
        int distance = (int) (Math.pow(Math.abs(y2 - y1), 2) + Math.pow(Math.abs(x2 - x1), 2));
        if ((x1 == x2 && y1 == y2) && (d1 == d2)) { // 무한대
            return -1;
        } else if ((x1 == x2 && y1 == y2) && (d1 != d2)) { // 접점이 없는 경우
            return 0;
        } else if (distance > Math.pow(d1 + d2, 2)) { // 두 점 사이 거리가 더 큰 경우
            return 0;
        } else if (distance < Math.pow(Math.abs(d2 - d1), 2)) { // 한 원이 내부에 있는 경우 (중점은 다름)
            return 0;
        } else if (distance == Math.pow(d1 + d2, 2)) { // 접점한개
            return 1;
        } else if (distance == Math.pow(Math.abs(d1 - d2), 2)) {
            return 1;
        }
        return 2;
    }
}
