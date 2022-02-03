
import java.io.*;
import java.util.*;

public class Boj_3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numList = new ArrayList<>();
        int sum = 0;
        int overNum = 0;

        for (int i = 0; i < 9; i++) {

            numList.add(Integer.parseInt(br.readLine()));
            sum = sum + numList.get(i);

        }

        overNum = sum - 100;

        for (int i = 0; i < 9; i++) {

            if ((numList.contains(overNum - numList.get(i))) && (numList.get(i) != overNum / 2)) {

                int indexNum = numList.indexOf(overNum - numList.get(i));
                if (i < indexNum) {
                    numList.remove(i);
                    numList.remove(indexNum - 1);
                } else {
                    numList.remove(indexNum);
                    numList.remove(i - 1);

                }

                break;

            }
        }

        for (int i = 0; i < 7; i++) {

            System.out.println(numList.get(i));

        }

    }

}
