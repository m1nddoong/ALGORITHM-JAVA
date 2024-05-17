package boj.step.H5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열의 반복 : https://www.acmicpc.net/problem/2675
public class Main2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 테스트 케이스의 개수 T 입력
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            // 각 문자를 r 번 반복할 것이다.
            int r = Integer.parseInt(st.nextToken());
            // 문자열 s 를 알파벳으로 자른 것
            String input = st.nextToken();
            char[] s = input.toCharArray();


            for (int j = 0; j < s.length; j++) {
                for (int k = 0; k < r; k++) {
                    sb.append(s[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
