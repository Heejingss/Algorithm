import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Boj_1244 {
    static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int switchN = Integer.parseInt(br.readLine());
        list = new int[switchN + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= switchN; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            onoff(sex, number);
        }
        for (int i = 1; i < list.length; i++) {
            bw.append(list[i] + " ");
            if (i % 20 == 0) {
                bw.append("\n");
            }

        }
        bw.flush();
        bw.close();

    }

    public static void onoff(int sex, int number) {
        if (sex == 1) { // 남학생
            for (int i = number; i < list.length; i = i + number) {
                if (list[i] == 0) {
                    list[i] = 1;
                } else {
                    list[i] = 0;
                }
            }
        } else if (sex == 2) { // 여학생

            if ((number == 1 || number == list.length - 1) || list[number - 1] != list[number + 1]) {
                if (list[number] == 1) {
                    list[number] = 0;
                } else {
                    list[number] = 1;
                }
            } else {
                if (list[number] == 1) {
                    list[number] = 0;
                } else {
                    list[number] = 1;
                }
                int left = number - 1;
                int right = number + 1;
                while (left > 0 && right < list.length) {
                    if (list[left] == list[right]) {
                        if (list[left] == 1) {
                            list[left] = 0;
                            list[right] = 0;
                        } else {
                            list[left] = 1;
                            list[right] = 1;
                        }
                        left--;
                        right++;
                    } else {
                        break;
                    }
                }
            }

        }

    }

}
