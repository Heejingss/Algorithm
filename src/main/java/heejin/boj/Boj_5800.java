package heejin.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_5800 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        int classcount = Integer.parseInt(bf.readLine());

        ArrayList<int[]> testList = new ArrayList<int[]>();
        ArrayList<Integer> maxList = new ArrayList<Integer>();
        int temp = 0;
        int max = 0;

        for (int i = 0; i < classcount; i++) {
            String str = bf.readLine();
            String arr[] = str.split(" ");
            int temparr[] = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                temparr[j] = Integer.parseInt(arr[j]);
            }
            testList.add(temparr);
        }

        for (int i = 0; i < testList.size(); i++) {
            for (int j = 1; j < testList.get(i).length - 1; j++) {
                for (int k = j + 1; k < testList.get(i).length; k++) {
                    if (testList.get(i)[j] > testList.get(i)[k]) {
                        temp = testList.get(i)[j];
                        testList.get(i)[j] = testList.get(i)[k];
                        testList.get(i)[k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < testList.size(); i++) {
            max = 0;
            for (int j = 0; j < testList.get(i).length - 1; j++) {
                if (testList.get(i)[j + 1] - testList.get(i)[j] > max) {
                    max = testList.get(i)[j + 1] - testList.get(i)[j];
                }
            }
            maxList.add(max);
        }

        for (int i = 0; i < testList.size(); i++) {
            System.out.printf("Class %d\n", i + 1);
            System.out.printf("Max %d, Min %d, Largest gap %d\n", testList.get(i)[testList.get(i).length - 1],
                    testList.get(i)[1], maxList.get(i));

        }

    }

}
