package heejin.boj;

import java.util.*;
import java.io.*;

public class Boj_10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int player1 = 100;
        int player2 = 100;

        for (int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int player1Score = Integer.parseInt(st2.nextToken());
            int player2Score = Integer.parseInt(st2.nextToken());

            if (player1Score > player2Score) {
                player2 = player2 - player1Score;
            } else if (player2Score > player1Score) {
                player1 = player1 - player2Score;
            }
        }

        System.out.println(player1);
        System.out.println(player2);
    }

}
