import java.io.*;
import java.util.*;

public class Boj_2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());

        if (minute + time >= 60) {
            hour = hour + time / 60;
            if (minute + time % 60 >= 60) {
                hour++;
                minute = minute + time % 60 - 60;
            } else {
                minute = minute + time % 60;
            }

            if (hour >= 24) {
                hour = hour - 24;
            }
        } else {
            minute = minute + time;
        }

        System.out.println(hour + " " + minute);
    }

}
