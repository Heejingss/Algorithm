
import java.io.*;
import java.util.*;

public class Boj_5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String sentence = st.nextToken();

        int count = 0;
        if (sentence.contains("JOI")) {
            for (int i = 0; i < sentence.length() - 2; i++) {
                char first = sentence.charAt(i);
                if (first == 'J') {
                    if (sentence.charAt(i + 1) == 'O') {
                        if (sentence.charAt(i + 2) == 'I') {
                            count++;

                        }
                    }
                }
            }

        }
        int count2 = 0;
        if (sentence.contains("IOI")) {
            for (int i = 0; i < sentence.length() - 2; i++) {
                char first = sentence.charAt(i);
                if (first == 'I') {
                    if (sentence.charAt(i + 1) == 'O') {
                        if (sentence.charAt(i + 2) == 'I') {
                            count2++;

                        }
                    }
                }
            }

        }
        System.out.println(count);
        System.out.println(count2);

    }

}
