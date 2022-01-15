package heejin.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1076 {
    public static void main(String[] args) throws IOException {

        String colorarr[] = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
        String valuearr[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        int multiplearr[] = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
                1000000000 };
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String str = bf.readLine();
        String str2 = bf.readLine();
        String str3 = bf.readLine();
        String value = "";
        long result = 0;

        for (int i = 0; i < 10; i++) {
            if (colorarr[i].equals(str)) {
                value = value + valuearr[i];
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (colorarr[i].equals(str2)) {
                value = value + valuearr[i];
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (colorarr[i].equals(str3)) {
                result = Long.parseLong(value) * multiplearr[i];
                break;
            }
        }

        System.out.println(result);

    }
}
