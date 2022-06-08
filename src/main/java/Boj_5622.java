import java.util.*;
import java.io.*;

public class Boj_5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char[] nums = str.toCharArray();

        char[][] list = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' }, { 'G', 'H', 'I' }, { 'J', 'K', 'L' },
                { 'M', 'N', 'O' }, { 'P', 'Q', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y', 'Z' } };

        int num1 = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < list.length; j++) {
                for (int k = 0; k < list[j].length; k++) {
                    if (nums[i] == list[j][k]) {
                        if (nums[i] == 1) {
                            sum += 2;
                        } else {
                            num1 = j + 3;
                            sum += num1;
                        }
                    }
                }
            }
        }
        bw.append(sum + "");
        bw.flush();
        bw.close();

    }

}
