import java.util.*;
import java.io.*;

public class Boj_2108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            list[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(list);
        System.out.println("---");
        // System.out.println(averageNum(list));
        // System.out.println(medianNum(list));
        System.out.println(modeNum(list));
        // System.out.println(rangeNum(list));

    }

    public static int averageNum(int[] numlist) {
        int sum = 0;
        for (int i = 0; i < numlist.length; i++) {
            sum += numlist[i];
        }

        return ((int) Math.round((double) sum / numlist.length));

    }

    public static int medianNum(int[] numlist) {

        return numlist[numlist.length / 2];
    }

    public static int modeNum(int[] numlist) {

        /*
         * boolean flag = false;
         * int mode_max = 0;
         * int mode = 10000;
         * int N = numlist.length;
         * 
         * for (int i = 0; i < N; i++) {
         * int jump = 0; // 동일한 수가 나온만큼 i 값 jump 시킬 변수
         * int count = 1;
         * int i_value = numlist[i];
         * 
         * for (int j = i + 1; j < N; j++) {
         * if (i_value != numlist[j]) {
         * break;
         * }
         * count++;
         * jump++;
         * }
         * 
         * if (count > mode_max) {
         * mode_max = count;
         * mode = i_value;
         * flag = true;
         * } else if (count == mode_max && flag == true) {
         * mode = i_value;
         * flag = false;
         * }
         * 
         * i += jump;
         * }
         * return mode;
         */

        int maxCount = 1;
        int tempCount = 1;
        int result = numlist[0];

        int[][] mode = new int[numlist.length][2];
        int index = 0;
        mode[0][0] = numlist[0];
        mode[0][1] = 1;

        int indexCheck = 0;

        for (int i = 1; i < numlist.length; i++) {
            if (numlist[i] == numlist[i - 1]) {
                tempCount++;

                mode[index][1] = tempCount;
                mode[index][0] = numlist[i];
            } else {
                index++;
                tempCount = 1;

                mode[index][1] = tempCount;
                mode[index][0] = numlist[i];
            }

            if (tempCount > maxCount) {
                maxCount = tempCount;
                result = numlist[i];
                mode[index][0] = numlist[i];
            }

        }
        Arrays.sort(mode, new Comparator<int[]>() {
            @Override
            public int compare(int[] n1, int[] n2) {
                return n1[1] - n2[1];
            }

        });

        ArrayList<Integer> modeFind = new ArrayList<>();

        for (int i = 0; i < mode.length; i++) {
            if (maxCount == mode[i][1]) {
                modeFind.add(mode[i][0]);

            }
        }

        if (modeFind.size() > 1) {
            return modeFind.get(1);
        } else {
            return modeFind.get(0);
        }

    }

    public static int rangeNum(int[] numlist) {

        return numlist[numlist.length - 1] - numlist[0];
    }
}
