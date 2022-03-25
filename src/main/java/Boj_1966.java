import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Boj_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Integer[] list = new Integer[N];
            st = new StringTokenizer(br.readLine());
            Queue<int[]> que = new LinkedList<>();

            for (int j = 0; j < N; j++) {
                int[] arr = new int[2];
                arr[0] = Integer.parseInt(st.nextToken());
                arr[1] = j;
                list[j] = arr[0];
                que.add(arr);
            }
            Arrays.sort(list, Collections.reverseOrder());
            bw.append(test(que, list, M) + "\n");
        }

        bw.flush();
        bw.close();

    }

    static int test(Queue<int[]> que, Integer[] list, int M) {
        int index = 0;
        int count = 1;
        while (!que.isEmpty()) {
            if (index >= list.length) {
                break;
            }
            if (que.peek()[0] == list[index]) {
                if (que.peek()[1] == M) {
                    que.poll();
                    break;
                } else {
                    que.poll();
                    index++;
                    count++;
                }
            } else {
                que.add(que.poll());
            }
        }

        return count;
    }

}
