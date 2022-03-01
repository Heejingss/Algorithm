import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = 0;
        if (x > w - x) {
            min = w - x;
        } else {
            min = x;
        }

        if ((y > h - y) && (min > h - y)) {
            min = h - y;
        } else if ((h - y > y) && (min > y)) {
            min = y;
        }
        bw.append(min + "");
        bw.flush();
        bw.close();
    }

}
