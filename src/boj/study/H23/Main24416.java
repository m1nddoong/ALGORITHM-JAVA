package boj.study.H23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알고리즘 수업 - 피보나치 수 1 : https://www.acmicpc.net/problem/24416
public class Main24416 {
    public static int RecurCount = 0;
    public static int DynamicCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int RecurResult = RecurFibo(n);
        int DynamicResult = DynamicFibo(n);
        sb.append(RecurCount).append(" ").append(DynamicCount);
        System.out.println(sb);
    }

    // 재귀 호출
    public static int RecurFibo(int n) {
        if (n == 1 || n == 2) {
            RecurCount ++;
            return 1; // 코드 1
        }
        else {
            return (RecurFibo(n-1) + RecurFibo(n-2));
        }
    }

    // 동적 프로그래밍
    public static int DynamicFibo(int n) {
        int[] f = new int[n+1];
        f[1] = f[2] = 1; // 첫번째 항과 두번째 항
        for (int i = 3; i <= n; i++) {
            DynamicCount ++;
            f[i] = f[i - 1] + f[i - 2]; // 코드 2
        }
        return f[n];
    }


}
