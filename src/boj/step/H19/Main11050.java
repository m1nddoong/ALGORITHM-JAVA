package boj.step.H19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11050 {
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new int[N + 1][K + 1];

        // System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
        // System.out.println(BC(N, K));
        System.out.println(BC_DP(N, K));
    }

    // 팩토리얼
    public static int factorial(int N) {
        if (N <= 1) { // factorial(0) == 1
            return 1;
        }
        return N * factorial(N - 1);
    }

    // 이항계수
    public static int BC(int n, int k) {
        // 2번 성질
        if (n == k || k == 0) {
            return 1;
        }
        // 1번 성질
        return BC(n - 1, k - 1) + BC(n - 1, k);
    }

    // 이항계수 + DP
    public static int BC_DP(int n, int k) {
        // 이미 풀었던 sub 문제의 경우 재활용
        if (dp[n][k] > 0) {
            return dp[n][k];
        }
        // 2번 성질
        if (k == 0 || n == k) {
            return dp[n][k] = 1;
        }
        // 1번 성질
        return dp[n][k] = BC_DP(n-1, k-1) + BC_DP(n-1, k);
    }

}
