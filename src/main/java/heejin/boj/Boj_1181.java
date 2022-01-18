package heejin.boj;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.*;

// public class Boj_1181 {
//     public static void main(String[] args) throws IOException {

//         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
//         int count = Integer.parseInt(bf.readLine());

//         ArrayList<String> myList = new ArrayList<String>();

//         for (int i = 0; i < count; i++) {
//             String str = bf.readLine();
//             myList.add(str);
//         }
//         String temp="";
//         for(int i=0; i<count-1;i++){
//             for(int j=i+1;i<count;j++){
//                 if(myList.get(i).length()>myList.get(j).length()){
//                     temp=myList.get(i);
//                     myList.get(i)=myList.get(i);
//                     myList.get(j)=temp;
//                 }
//             }
//         }
//         for (int i = 0; i < count; i++) {
//             System.out.println(myList.get(i).length());
//         }

//     }
// }

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj_1181 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n]; // 문자열 배열에 데이터 저장

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        Arrays.sort(arr, new Comparator<String>() { // 문자열 배열 행을 기준으로 정렬

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { // 두 문자열의 길이가 같은 경우는
                    return o1.compareTo(o2); // 사전 순으로 정렬
                } else { // 그 외에는 문자열들의 길이로 비교
                    return Integer.compare(o1.length(), o2.length());
                }

            }

        });

        System.out.println(arr[0]); // 중복을 고려해 출력하기 위해 첫 번째 문자열은 출력
        for (int i = 1; i < arr.length; i++) { // 1번 인덱스부터 이전 인덱스와 비교해 출력하기 때문에 위의 처리는 문제X
            if (arr[i - 1].equals(arr[i]))
                continue; // 같은 문자열이라면 건너뛰고
            System.out.println(arr[i]); // 문자열 출력
        }
    }
}