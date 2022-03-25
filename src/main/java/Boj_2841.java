import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_2841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer>[] stack = new Stack[7];

        for (int i = 0; i <= 6; i++)
            stack[i] = new Stack<>();

        int time = 0;

        for (int i = 0; i < n; i++) {
            while (!stack[list[i][0]].isEmpty() && stack[list[i][0]].peek() > list[i][1]) {
                stack[list[i][0]].pop();
                time++;
            }

            if (stack[list[i][0]].empty() || (!stack[list[i][0]].isEmpty() && stack[list[i][0]].peek() < list[i][1])) {
                stack[list[i][0]].push(list[i][1]);
                time++;
            }
        }

        // 손을 뗐을때 이미 눌려있는 것에 대한 처리가 안됨 -> Stack 사용할것
        // int time = 1;
        // map.put(list[0][0], list[0][1]);
        // for (int i = 1; i < n; i++) {
        // if (map.containsKey(list[i][0])) {
        // if (map.get(list[i][0]) > list[i][1]) {
        // time++;
        // map.put(list[i][0], list[i][1]);
        // }
        // }
        // map.put(list[i][0], list[i][1]);
        // System.out.println(" ");
        // time++;
        // }

        bw.append(time + "");
        bw.flush();
        bw.close();
    }

}
