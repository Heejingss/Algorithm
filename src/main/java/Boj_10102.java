import java.io.*;

public class Boj_10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }
        if (a > b) {
            System.out.println("A");
        } else if (b > a) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }

}
