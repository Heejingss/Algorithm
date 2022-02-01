package heejin.boj;

import java.io.*;
import java.util.*;

public class Boj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String upperN = n.toUpperCase();

        char checkN = ' ';
        int[] countN = new int[26];
        String alpabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < alpabet.length(); j++) {
                if (upperN.charAt(i) == alpabet.charAt(j)) {
                    countN[j]++;
                }
            }
        }

        int max = countN[0];
        int maxIndex = 0;

        for (int i = 0; i < countN.length; i++) {
            if (countN[i] > max) {
                max = countN[i];
                maxIndex = i;
            }
        }
        // for (int i = 0; i < countN.length; i++) {
        // System.out.println(countN[i]);
        // }
        boolean check = false;
        for (int i = 0; i < countN.length; i++) {
            if ((max == countN[i]) && (i != maxIndex)) {
                check = true;
            }
        }
        if (check) {
            System.out.println("?");
        } else {
            System.out.println(alpabet.charAt(maxIndex));
        }
    }

}
