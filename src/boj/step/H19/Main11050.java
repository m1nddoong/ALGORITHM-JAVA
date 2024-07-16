package boj.step.H19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11050 {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
        System.out.println(BC(N, K));
    }

    // 팩토리얼
    public static int factorial(int N) {
        if (N <= 1) { // factorial(0) == 1
            return 1;
        }
        return N * factorial(N - 1);
    }

    // 이항계수의 성질
    public static int BC(int n, int k) {
        // 2번 성질
        if (n == k || k == 0) {
            return 1;
        }
        // 1번 성질
        return BC(n-1, k-1) + BC(n-1, k);
    }
}
