package boj.step.H13;

import java.io.*;
import java.util.*;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N개의 단어
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같다면 사전순 정렬
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); // 양수라면? "s1 이 s2 보다 사전적으로 순서 앞이다"
                }
                else {
                    // 양수가 나오면 자리를 바꿈 (양수가 나온다는 건 s1이 더 크다는 얘기임)
                    // 즉 큰 수들이 뒤로 이동하기 떄문에 오름차순 정렬이 된다.
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for (int i = 1; i < N; i++) {
            // 중복되지 않는 것만 출력
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);


    }



}



