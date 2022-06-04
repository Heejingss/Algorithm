import java.util.*;
import java.io.*;

public class Boj_1074 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int length = 1;
        for (int i = 0; i < n; i++) {
            length = length * 2;
        }
        find(length, a, b);
        System.out.println(count);
        // int result = 0;
        // int size = 0;
        // int indexi = 0;
        // int indexj = 0;
        // while (size != 2) {
        // if (indexi + size / 2 - 1 < a) {
        // result = result + size / 2 * size;
        // System.out.println(result);
        // indexi = indexi + size / 2;
        // size = size / 2;
        // } else if (indexi + size / 2 - 1 > a) {
        // size = size / 2;
        // } else {
        // break;
        // }
        // }

        // size = length;
        // while (size != 2) {
        // if (indexj + size / 2 - 1 < b) {
        // result = result + size / 2 * size;
        // System.out.println(result);
        // indexj = indexj + size / 2;
        // size = size / 2;
        // } else if (indexj + size / 2 - 1 > b) {
        // size = size / 2;
        // } else {
        // break;
        // }
        // }

    }

    private static void find(int size, int r, int c) {
        if (size == 1)
            return;
        if (r < size / 2 && c < size / 2) {
            find(size / 2, r, c);
        } else if (r < size / 2 && c >= size / 2) {
            count += size * size / 4;
            find(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            count += (size * size / 4) * 2;
            find(size / 2, r - size / 2, c);
        } else {
            count += (size * size / 4) * 3;
            find(size / 2, r - size / 2, c - size / 2);
        }
    }
}
