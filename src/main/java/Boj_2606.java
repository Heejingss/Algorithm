import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Boj_2606 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());
        int[][] list = new int[n + 1][n + 1];

        for (int i = 0; i < pair; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a][b] = 1;
            list[b][a] = 1;
        }

        // 방문처리
        int[] visited = new int[n + 1];
        // boolean[] visited = new boolean[n + 1];
        System.out.println(bfs(1, visited, list));

    }

    static int bfs(int start, int[] visited, int[][] list) { // BFS 메소드
        Queue<Integer> q = new LinkedList<>();

        visited[start] = 1;
        q.offer(start);
        int count = 0;

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 1; i < list.length; i++) { // 연결된 컴퓨터 찾기
                if (list[x][i] == 1 && visited[i] != 1) {
                    q.offer(i);
                    visited[i] = 1;
                    count++;
                }
            }
        }
        return count;
    }

}
