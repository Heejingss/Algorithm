import java.io.*;
import java.util.*;
import java.math.*;

public class Boj_10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger temp1 = new BigInteger("0"); // 0
        BigInteger temp2 = new BigInteger("1");
        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < n; i++) {
            sum = temp1.add(temp2);
            temp1 = temp2;
            temp2 = sum;

        }
        System.out.println(temp1);
    }

}
