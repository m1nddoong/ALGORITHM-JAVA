package BOJ.step.H15_약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 골드바흐 파티션 - https://www.acmicpc.net/problem/17103
public class Main17103 {
    public static boolean[] prime;
    public static int partition_count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 2 ~ 1000000 까지의 숫자중 소수를 구하기
        get_prime();

        StringBuilder sb = new StringBuilder();
        // 중복을 피하는 방법 : 절반까지만 탐색하면 된다.
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            // N을 만들 수 있는 골드바흐 파티션의 개수
            for (int j = 2; j <= N / 2; j++) {
                if (!prime[j] && !prime[N - j])
                    partition_count++;
            }
            sb.append(partition_count).append('\n');
            partition_count = 0;
        }
        System.out.println(sb);
    }

    // 에라토스테네스의 체 : 소수가 false인 배열 만들기
    public static void get_prime() {
        prime = new boolean[1000001];
        prime[0] = prime[1] = true; // 소수가 아님
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            // 소수가 아니라면 pass
            if (prime[i]) {
                continue;
            }

            // 소수라면 그 소수의 배수들은 전부 제외
            for (int j = i + i; j < 1000000; j += i) {
                prime[j] = true;
            }
        }
    }
}

