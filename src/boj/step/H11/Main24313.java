package boj.step.H11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 알고리즘 수업 - 점근적 표기 1 : https://www.acmicpc.net/problem/24313
public class Main24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 함수 f(n) = a1 * n + a0
        int a1 = Integer.parseInt(st.nextToken()); // 7
        int a0 = Integer.parseInt(st.nextToken()); // 7
        // 양의 정수 c, n0
        int c = Integer.parseInt(br.readLine()); // 8
        int n0 = Integer.parseInt(br.readLine()); // 1

        if (CheckBigO(a1, a0, c, n0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
    // O(n) 의 정의를 만족하는지 확인
    public static boolean CheckBigO(int a1, int a0, int c, int n0) {
        // n >= n0  n을 넣었을 때 만족하는지
        for (int i = n0; i <= 100 ; i++) {
            if ((a1 * i + a0) > c * i) {
                return false;
            }
        }
        return true;
    }
}
