import java.io.*;
import java.util.*;

public class Boj_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        String[] list = new String[row];

        for (int i = 0; i < row; i++) {
            list[i] = br.readLine();
        }

        int area = 1;
        int length = 0;

        if (row >= column) {
            length = column - 1;
        } else {
            length = row - 1;
        }
        while (length > 0) {
            for (int i = 0; i < row - length; i++) {
                for (int j = 0; j < column - length; j++) {
                    char temp = list[i].charAt(j);
                    if (temp == list[i].charAt(j + length)) {
                        if (temp == list[i + length].charAt(j + length)) {
                            if (temp == list[i + length].charAt(j)) {
                                area = Math.max((length + 1) * (length + 1), area);
                            }
                        }
                    }
                }

            }
            length--;
        }

        System.out.println(area);

    }

}
