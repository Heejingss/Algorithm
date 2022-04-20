import java.util.*;
import java.io.*;

public class Boj_10158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        x = a - Math.abs(a - (time + x) % (2 * a));
        y = b - Math.abs(b - (time + y) % (2 * b));

        sb.append(x + " " + y);
        bw.append(sb);
        bw.flush();
        bw.close();

        // if (((x + time) / a) % 2 == 0) {
        // x = (x + time) % a;
        // } else {
        // x = a - (x + time) % a;
        // }

        // if (((y + time) / b % 2) == 0) {
        // y = (y + time) % b;
        // } else {
        // y = b - (y + time) % b;
        // }

        // x += time % (a * 2);
        // y += time % (b * 2);
        // if (x > a)
        // x = Math.abs(a * 2 - x);
        // if (y > b)
        // y = Math.abs(b * 2 - y);

        // int result = 0;
        // boolean reflectX = true;
        // boolean reflectY = true;
        // while (time > result) {
        // time
        // }
        // while (time > result) {
        // while ((x <= a && y <= b) && (x >= 0 && y >= 0) && (time > result)) {
        // result++;
        // if (reflectX) {
        // x++;
        // } else {
        // x--;
        // }
        // if (reflectY) {
        // y++;
        // } else {
        // y--;
        // }
        // }
        // if (x > a) {
        // reflectX = false;
        // x = x - 2;
        // }
        // if (y > b) {
        // reflectY = false;
        // y = y - 2;
        // }

        // if (x < 0) {
        // reflectX = true;
        // x = x + 2;
        // } else if (y < 0) {
        // reflectX = true;
        // y = y + 2;
        // }
        // }

    }

}
