package boj.step.H9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소인수분해 : https://www.acmicpc.net/problem/11653
public class Main11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 2부터 소인수분해 시작
        for (int i = 2; i <= 10000000; i++) {
            while (n % i == 0) { // n의 약수라면
                n /= i; // i로 나눈 몫을 업데이트
                System.out.println(i);
            }
        }
    }
}
