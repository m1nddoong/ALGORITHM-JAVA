package boj.step.H15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수, 배수와 소수 2 : 베르트랑 공준 - https://www.acmicpc.net/problem/4948
public class Main4948 {
    // n <= 123456 이므로 2n은 최대 246912 (0 포함 246912+1 = 246913)
    public static boolean[] primeNum = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_primeNum();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            // n보다 크고 2n보다 작거나 같은 소수 구하기
            int count = 0;
            for (int i = N+1; i <= 2*N; i++) {
                if(!primeNum[i]) count++;
            }
            System.out.println(count);
        }
    }


    public static void get_primeNum() {
        // true = 소수가 아님
        primeNum[0] = primeNum[1] = true;
        for (int i = 2; i < Math.sqrt(primeNum.length); i++) {
            if (primeNum[i]) continue;
            for (int j = i*i; j < primeNum.length; j += i) {
                primeNum[j] = true;
            }
        }
    }
}
