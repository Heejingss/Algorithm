import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Boj_2644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int pair = Integer.parseInt(br.readLine());
        int[][] list = new int[n + 1][n + 1];

        for (int i = 0; i < pair; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x][y] = 1;
            list[y][x] = 1;
        }

        // 방문처리
        int[] visited = new int[n + 1];
        // boolean[] visited = new boolean[n + 1];
        System.out.println(bfs(a, b, visited, list));

    }

    static int bfs(int start, int end, int[] visited, int[][] list) { // BFS 메소드
        Queue<Integer> q = new LinkedList<>();
        visited[start] = 1;
        q.offer(start);

        int result = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                int x = q.poll();
                if (x == end) {
                    return result;
                }
                for (int i = 1; i < list.length; i++) {
                    if (list[x][i] == 1 && visited[i] != 1) {
                        q.offer(i);
                        visited[i] = 1;
                    }
                }
            }
            result++;
        }
        return -1;
    }

}
