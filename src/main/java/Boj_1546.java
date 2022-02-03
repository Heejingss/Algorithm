
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String str = bf.readLine();
        int count = Integer.parseInt(str);
        String score = bf.readLine();
        String arr[] = score.split(" ");
        int max = 0;
        float sum = 0;

        for (int i = 0; i < count; i++) {
            if (max < Integer.parseInt(arr[i]))
                max = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < count; i++) {

            sum = sum + (Float.valueOf(arr[i]) / max * 100);
        }

        System.out.println(sum / count);

    }
}
