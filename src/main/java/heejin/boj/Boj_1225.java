package heejin.boj;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        String arr[] = score.split(" ");
        String num1 = arr[0];
        String num2 = arr[1];
        // 문자 풀이
        long result = 0;
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                result = result + Integer.parseInt(num1.charAt(i) + "") *
                        Integer.parseInt(num2.charAt(j) + "");
            }
        }
        System.out.println(result);

    }
}
