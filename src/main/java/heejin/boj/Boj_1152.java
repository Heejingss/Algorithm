package heejin.boj;

import java.io.*;
import java.util.*;

public class Boj_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            System.out.println(0);
        } else {
            String arr[] = sentence.split(" ");
            System.out.println(arr.length);
        }
    }

}
