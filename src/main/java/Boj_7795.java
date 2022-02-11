import java.io.*;
import java.util.*;

public class Boj_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int groupN = Integer.parseInt(st.nextToken());
        ArrayList<int[]> mylist = new ArrayList<>();

        for (int i = 0; i < groupN; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int[] listA = new int[a];
            int[] listB = new int[b];
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {

                listA[j] = Integer.parseInt(st3.nextToken());
            }
            StringTokenizer st4 = new StringTokenizer(br.readLine());
            for (int k = 0; k < b; k++) {

                listB[k] = Integer.parseInt(st4.nextToken());
            }
            mylist.add(listA);
            mylist.add(listB);
        }
        Arrays.sort(mylist.get(0));

        for (int i = 0; i < mylist.size(); i++) {
            Arrays.sort(mylist.get(i));
        }

        for (int i = 0; i < mylist.size(); i = i + 2) {
            int count = 0;
            for (int j = 0; j < mylist.get(i).length; j++) {

                count = count + binarySearch(mylist.get(i + 1), 0, mylist.get(i + 1).length - 1, mylist.get(i)[j]);

            }
            System.out.println(count);
        }

    }

    public static int binarySearch(int[] list, int left, int right, int target) {
        int result = left;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (list[mid] < target) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return result;
    }

}
