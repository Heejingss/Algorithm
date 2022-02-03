
import java.io.*;

public class Boj_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String str = bf.readLine();
        String arr[] = str.split(" ");
        int count = Integer.parseInt(arr[0]);
        int maxline = Integer.parseInt(arr[1]);

        String card = bf.readLine();
        String arr2[] = card.split(" ");
        int arr3[] = new int[count];
        int temp = 0;
        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] > arr3[j]) {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr3.length - 2; i++) {
            for (int j = i + 1; j < arr3.length - 1; j++) {
                for (int k = j + 1; k < arr3.length; k++) {
                    sum = arr3[i] + arr3[j] + arr3[k];
                    if ((max < sum) && (sum <= maxline)) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);

    }
}
