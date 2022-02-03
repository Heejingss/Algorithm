
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String str = bf.readLine();
        String str2 = bf.readLine();

        if (str.length() >= str2.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}
