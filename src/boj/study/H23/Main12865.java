package boj.study.H23;

// 평범한 배낭 : https://www.acmicpc.net/problem/12865

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]); // 물건의 수
        int K = Integer.parseInt(input.split(" ")[1]); // 배낭 무게

        // N = 0, K = 0 일떄는 제외함

        int[] W = new int[N+1]; // 물건의 무게
        int[] V = new int[K+1]; // 물건의 가치
        int[][] dp = new int[N + 1][K + 1];

        // ex) 두번째 인덱스의 물건 = 4kg, 8만원 (4, 8)
        // -> W[2] = 4, V[2] = 8

        for (int i = 1; i <= N; i++) {
            input = br.readLine();
            W[i] = Integer.parseInt(input.split(" ")[0]);
            V[i] = Integer.parseInt(input.split(" ")[1]);
        }

        for (int i = 1; i <= N; i++) { // 몇 번째 물건인지 (i)
            for (int j = 1; j <= K; j++) { // 배낭의 제한 무게 (j)
                // i번째 물건의 무게를 더 담을 수 없는 경우
                if (W[i] > j) {
                    // 이미 저장된 값을 불러오기
                    dp[i][j] = dp[i - 1][j];
                }
                // i반째 물건의 무게를 더 담을 수 있는 경우
                else {
                    // 담고 나서 또 담을 수 있는 경우
                    // 담고 나서 가방이 다 찬 경우
                    // 둘중 더 큰 가치를 선택
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
