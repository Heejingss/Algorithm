import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        int point = 0;
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            int tempPoint = 0;
            if (list[i].charAt(0) == 'O') {
                tempPoint = 1;
                point = 1;
            }
            for (int j = 1; j < list[i].length(); j++) {
                if (list[i].charAt(j) == 'O') {
                    if (list[i].charAt(j - 1) == 'O') {
                        tempPoint++;
                    } else {
                        tempPoint = 1;
                    }
                } else {
                    tempPoint = 0;
                }
                point = point + tempPoint;
            }
            bw.append(point + "\n");
            point = 0;
            tempPoint = 0;
        }
        bw.flush();
        bw.close();
    }

}
