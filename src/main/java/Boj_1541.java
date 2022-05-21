import java.util.*;
import java.io.*;

public class Boj_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] list = str.split("-");
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].contains("+")) {
                int sum = 0;
                String[] temp = list[i].split("\\+");
                for (int j = 0; j < temp.length; j++) {
                    sum = sum + Integer.parseInt(temp[j]);
                }
                array.add(sum);
            } else {
                array.add(Integer.parseInt(list[i]));
            }
        }
        if (array.size() == 1) {
            bw.append(array.get(0) + "");
        } else {
            int base = array.get(0);
            for (int i = 1; i < array.size(); i++) {
                base = base - array.get(i);
            }
            bw.append(base + "");
        }
        bw.flush();
        bw.close();

    }

}
