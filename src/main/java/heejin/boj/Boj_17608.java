package heejin.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_17608 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        int numberCount = Integer.parseInt(bf.readLine());
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int num = 1;
        for (int i = 0; i < numberCount; i++) {
            String str = bf.readLine();
            numList.add(Integer.parseInt(str));
        }

        // timeover
        for (int i = 0; i < numList.size() - 1; i++) {
            int k = 0;
            for (int j = i + 1; j < numList.size(); j++) {
                if (numList.get(i) > numList.get(j)) {
                    k = k + 1;
                } else {
                    break;
                }
            }
            if (k == numList.size() - i - 1) {
                num = num + 1;
            }
        }

        // success
        int maxHeight = numList.get(numList.size() - 1);
        for (int i = numList.size() - 2; i >= 0; i--) {
            if (numList.get(i) > maxHeight) {
                num++;
                maxHeight = numList.get(i);
            }
        }

        System.out.println(num);
    }

}
