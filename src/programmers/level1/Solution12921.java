package programmers.level1;

import java.util.Arrays;

// 소수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class Solution12921 {
    public static int solution(int n) {
        boolean[] primeNumbers = new boolean[n + 1];
        Arrays.fill(primeNumbers, true);
        // 0과 1은 소수가 아니므로 제외
        primeNumbers[0] = primeNumbers[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primeNumbers[i]) { // 만약 소수면
                // 그 소수의 배수는 소수가 아니다!
                for (int j = i * i; j <= n; j += i) {
                    primeNumbers[j] = false;
                }

            }
        }
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (primeNumbers[i]) cnt++;
        }
        return cnt;

    }


    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
