import java.io.*;
import java.util.*;

public class Boj_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] list = new int[n][m];
        int[] find = new int[n * m];
        // final HashMap<Integer, Integer> map = new HashMap<>();
        // HashMap<int, int> map = new HashMap<>();
        ArrayList<int[]> result = new ArrayList<>();
        int tempi = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                list[i][j] = Integer.parseInt(st.nextToken());
                // map.put(list[i][j], map.getOrDefault(list[i][j], 0) + 1);
                find[tempi++] = list[i][j];
            }
        }

        // List<Integer> keySetList = new ArrayList<>(map.keySet());
        // // System.out.println("------value 오름차순------");
        // Collections.sort(keySetList, new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return map.get(o2).compareTo(map.get(o1));
        // }
        // });

        Arrays.sort(find);
        int blocks = b;

        for (int base = find[0]; base <= find[n * m - 1]; base++) {

            int outblocks = 0; // 버릴블럭 수
            int inblocks = 0; // 추가로 쌓을 블럭 수
            blocks = b;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (list[i][j] - base > 0) { // 블럭 버릴거임
                        blocks = blocks + list[i][j] - base;
                        outblocks = outblocks + list[i][j] - base;
                    } else if (list[i][j] - base < 0) { // 추가로 가져와야함
                        inblocks = inblocks + (base - list[i][j]);
                    }
                }
            }

            if (inblocks != 0) {// 가져와야하는 경우
                if (inblocks > blocks) { // 추가로 쌓을 블럭>가진 블럭 -> 못 가져옴
                    continue;
                } else if (inblocks <= blocks) { // 추가로 쌓을 블럭==가진 블럭 -> 가져올 수 있음
                    int[] temp = { inblocks + outblocks * 2, base };
                    result.add(temp);
                }
            } else {
                int[] temp = { inblocks + outblocks * 2, base };
                result.add(temp);
            }
        }

        Collections.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if (s1[0] == s2[0]) {
                    return s2[1] - s1[1];
                } else {
                    return s1[0] - s2[0];
                }

            }

        });

        bw.append(result.get(0)[0] + " " + result.get(0)[1]);
        bw.flush();
        bw.close();

    }
}
