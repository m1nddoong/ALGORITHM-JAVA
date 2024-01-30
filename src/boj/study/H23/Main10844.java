package boj.study.H23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 쉬운 계단 수 : https://www.acmicpc.net/problem/10844
public class Main10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 수의 길이 N
        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N + 1][10];
        long mod = 1_000_000_000;

        // 초기값 설정
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1L;
        }

        // 두 번째 자릿수부터 N까지 탐색
        for (int i = 2; i <= N; i++) { // 길이가 N인 계단수
            for (int j = 0; j <= 9; j++) {
                // 0으로 시작하는 계단 수의 개수는
                // 길이가 i-1 이고 1로 시작하는 계단 개수의 개수와 동일하다.
                if (j == 0) {
                    dp[i][j] = (dp[i - 1][j + 1]) % mod;
                }
                // 9로 시작하는 계단의 수는 i-1 길이의 8로 시작하는 계단 수의 개수와 같다.
                else if (j == 9) {
                    dp[i][j] = (dp[i - 1][j - 1]) % mod;
                }
                // j(1~8)로 시작하는 계단 수는 i-1 길이의 j-1로 시작하는 계단의 수와
                // j+1로 시작하는 계단수의 개수의 합과 동일하다.
                else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i-1][j+1]) % mod;
                }
            }
        }
        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += dp[N][i];
        }
        System.out.println(sum % mod);

    }


}