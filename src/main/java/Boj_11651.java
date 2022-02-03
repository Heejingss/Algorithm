
import java.util.*;
import java.io.*;

public class Boj_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        ArrayList<int[]> pointList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pointX = Integer.parseInt(st.nextToken());
            int pointY = Integer.parseInt(st.nextToken());
            int temparr[] = { pointX, pointY };
            pointList.add(temparr);
        }

        // for (int i = 0; i < count - 1; i++) {
        // for (int j = i + 1; j < count; j++) {
        // if (pointList.get(i)[1] > pointList.get(j)[1]) {
        // int tempY = pointList.get(i)[1];
        // int tempX = pointList.get(i)[0];
        // int temparr[] = { tempX, tempY };

        // int tempY2 = pointList.get(j)[1];
        // int tempX2 = pointList.get(j)[0];
        // int temparr2[] = { tempX2, tempY2 };

        // pointList.set(i, temparr2);
        // pointList.set(j, temparr);

        // } else if (pointList.get(i)[1] == pointList.get(j)[1]) {
        // if (pointList.get(i)[0] > pointList.get(j)[0]) {
        // int tempY = pointList.get(i)[1];
        // int tempX = pointList.get(i)[0];
        // int temparr[] = { tempX, tempY };

        // int tempY2 = pointList.get(j)[1];
        // int tempX2 = pointList.get(j)[0];
        // int temparr2[] = { tempX2, tempY2 };

        // pointList.set(i, temparr2);
        // pointList.set(j, temparr);
        // }
        // }

        // }
        // }

        for (int i = 0; i < count; i++) {
            System.out.print(pointList.get(i)[0] + " ");
            System.out.println(pointList.get(i)[1]);
        }

    }

}
