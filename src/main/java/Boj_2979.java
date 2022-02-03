
import java.io.*;
import java.util.*;

public class Boj_2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int fee1 = Integer.parseInt(st.nextToken());
        int fee2 = Integer.parseInt(st.nextToken());
        int fee3 = Integer.parseInt(st.nextToken());

        int totalFee = 0;

        StringTokenizer stA = new StringTokenizer(br.readLine());
        int truck1_arrival = Integer.parseInt(stA.nextToken());
        int truck1_leave = Integer.parseInt(stA.nextToken());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        int truck2_arrival = Integer.parseInt(stB.nextToken());
        int truck2_leave = Integer.parseInt(stB.nextToken());
        StringTokenizer stC = new StringTokenizer(br.readLine());
        int truck3_arrival = Integer.parseInt(stC.nextToken());
        int truck3_leave = Integer.parseInt(stC.nextToken());

        if ((truck1_leave > truck2_arrival) && (truck1_leave > truck3_arrival)) {
            if (truck1_leave > truck2_leave) {
                if (truck2_leave > 0)
                    totalFee = (truck2_leave - truck2_arrival) * fee2;
            }
        }

        // int totalTime=
    }

}
