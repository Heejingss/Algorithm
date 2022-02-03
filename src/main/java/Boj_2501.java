
import java.io.*;
import java.util.*;

public class Boj_2501 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        // int num2 = Integer.parseInt(st.nextToken());
        ArrayList<Integer> dividerList = new ArrayList<>();

        // for (int i = 1; i <= num1 / 2; i++) {
        // if (num1 % i == 0) {
        // dividerList.add(i);

        // }
        // }

        // dividerList.add(num1);

        // if (num2 > dividerList.size()) {
        // System.out.println(0);
        // } else {
        // System.out.println(dividerList.get(num2 - 1));
        // }

        // 소인수 분해
        // int i = 2;
        // while (i <= num1) {
        // if (num1 % i == 0) {
        // System.out.println(i);
        // num1 = num1 / i;
        // } else
        // i++;
        // }

        if (num1 != 1) {
            // 유승민
            int k = num1;

            for (int i = 2;; i++) {
                if (i > k / 2) {
                    dividerList.add(k);
                    break;
                }
                while (i <= k / 2) {
                    while (k % i == 0) {
                        if (k == i) {

                            break;
                        }
                        dividerList.add(i);

                        k = k / i;
                    }
                    break;
                }
            }

            for (int i = 0; i < dividerList.size(); i++) {
                System.out.println(dividerList.get(i));
            }
        }
    }
}
