package BOJ.step.H15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 약수, 배수와 소수 2: 소수 구하기 - https://www.acmicpc.net/problem/1929
public class Main1929 {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 3
        int N = Integer.parseInt(st.nextToken()); // 16

        prime = new boolean[N + 1];
        get_prime();

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            // false = 소수
            if(!prime[i]) sb.append(i).append('\n');
        }
        System.out.println(sb);
    }

    public static void get_prime() {
        // true = 소수 아님, false = 소수
        prime[0] = prime[1] = true;
        // 2 ~ 루트N까지의 숫자 중
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            // 소수가 아니면 패스
            if (prime[i]) continue;
            // 소수인 것들(2, 3, 5, 7 ...)의 배수를 제거
            for (int j = i*i; j < prime.length ; j += i) {
                prime[j] = true;
            }
        }
    }
}
