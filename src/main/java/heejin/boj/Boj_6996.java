package heejin.boj;

import java.io.*;
import java.util.*;

public class Boj_6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String result = "";

        // for (int i = 0; i < count; i++) {
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // String word1 = st.nextToken();
        // String word2 = st.nextToken();
        // int containCheck = 0;

        // for (int j = 0; j < word1.length(); j++) {
        // if (word2.contains(word1.charAt(j) + "")) {
        // containCheck++;
        // }
        // }
        // if (containCheck == word1.length()) {
        // result = result + word1 + " & " + word2 + " are anagrams.";
        // } else {
        // result = result + word1 + " & " + word2 + " are NOT anagrams.";
        // }

        // result = result + "\n";
        // }

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();
            char[] sortArray1 = word1.toCharArray();
            char[] sortArray2 = word2.toCharArray();
            Arrays.sort(sortArray1);
            Arrays.sort(sortArray2);
            if (Arrays.equals(sortArray1, sortArray2)) {
                result = result + word1 + " & " + word2 + " are anagrams.\n";
            } else {
                result = result + word1 + " & " + word2 + " are NOT anagrams.\n";
            }
        }
        System.out.println(result.trim());
    }
}
