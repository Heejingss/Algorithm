import java.io.*;
import java.util.*;
import java.util.Map.*;
//import java.util.Map.Entry;

public class Boj_5568 {
    // HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int pick = Integer.parseInt(st2.nextToken());
        String[] list = new String[n];
        String[] outlist = new String[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            list[i] = st3.nextToken();
        }

        HashSet<String> set = new HashSet<>();// HashSet생성
        // DFS
        dfs_perm(list, outlist, visited, 0, n, pick, set);
        System.out.println(set.size());
        /*
         * if (pick == 2) {
         * for (int i = 0; i < n - 1; i++) {
         * for (int j = i + 1; j < n; j++) {
         * // System.out.print(list[i] + list[j]);
         * // System.out.print(list[j] + list[i] + "\n");
         * set.add(list[i] + list[j]);
         * set.add(list[j] + list[i]);
         * }
         * }
         * } else if (pick == 3) {
         * for (int i = 0; i < n - 2; i++) {
         * for (int j = i + 1; j < n - 1; j++) {
         * for (int k = j + 1; k < n; k++) {
         * 
         * set.add(list[i] + list[j] + list[k]);
         * set.add(list[i] + list[k] + list[j]);
         * set.add(list[j] + list[i] + list[k]);
         * set.add(list[j] + list[k] + list[i]);
         * set.add(list[k] + list[j] + list[i]);
         * set.add(list[k] + list[i] + list[j]);
         * 
         * }
         * }
         * }
         * } else if (pick == 4) {
         * for (int i = 0; i < n - 3; i++) {
         * for (int j = i + 1; j < n - 2; j++) {
         * for (int k = j + 1; k < n - 1; k++) {
         * for (int p = k + 1; p < n; p++) {
         * 
         * set.add(list[i] + list[j] + list[k] + list[p]);
         * set.add(list[i] + list[k] + list[j] + list[p]);
         * set.add(list[j] + list[i] + list[k] + list[p]);
         * set.add(list[j] + list[k] + list[i] + list[p]);
         * set.add(list[k] + list[j] + list[i] + list[p]);
         * set.add(list[k] + list[i] + list[j] + list[p]);
         * 
         * set.add(list[i] + list[j] + list[p] + list[k]);
         * set.add(list[i] + list[k] + list[p] + list[j]);
         * set.add(list[j] + list[i] + list[p] + list[k]);
         * set.add(list[j] + list[k] + list[p] + list[i]);
         * set.add(list[k] + list[j] + list[p] + list[i]);
         * set.add(list[k] + list[i] + list[p] + list[j]);
         * 
         * set.add(list[i] + list[p] + list[j] + list[k]);
         * set.add(list[i] + list[p] + list[k] + list[j]);
         * set.add(list[j] + list[p] + list[i] + list[k]);
         * set.add(list[j] + list[p] + list[k] + list[i]);
         * set.add(list[k] + list[p] + list[j] + list[i]);
         * set.add(list[k] + list[p] + list[i] + list[j]);
         * 
         * set.add(list[p] + list[i] + list[j] + list[k]);
         * set.add(list[p] + list[i] + list[k] + list[j]);
         * set.add(list[p] + list[j] + list[i] + list[k]);
         * set.add(list[p] + list[j] + list[k] + list[i]);
         * set.add(list[p] + list[k] + list[j] + list[i]);
         * set.add(list[p] + list[k] + list[i] + list[j]);
         * 
         * }
         * }
         * }
         * }
         * }
         */

    }

    static void dfs_perm(String[] arr, String[] output, boolean[] visited, int depth, int n, int r,
            HashSet<String> set) {
        if (depth == r) {
            print(output, r, set); // 순열 출력을 위한 print 함수
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                dfs_perm(arr, output, visited, depth + 1, n, r, set);
                visited[i] = false;
            }
        }
    }

    // 배열 출력
    static void print(String[] arr, int r, HashSet<String> set) {
        String result = "";
        for (int i = 0; i < r; i++) {
            result = result + arr[i];
        }
        set.add(result);
    }

}
