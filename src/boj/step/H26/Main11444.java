package boj.step.H26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 6 : https://www.acmicpc.net/problem/11444
public class Main11444 {
    public static int f0 = 0;
    public static int f1 = 1;
    public static Integer sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo(n);
        System.out.println(sum % 1000000007);
    }

    public static void fibo(int num) {
        if (num >= 2) {
            // 만약 num 이 2 이상이라면 -> 쪼개가  F_5
            fibo(num - 1);
            fibo(num - 2);
            return;
        } else {
            // 그렇게 해서 쪼개고 난 뒤에 계산하여 합계에 저장
            sum += num;
        }
    }
}
