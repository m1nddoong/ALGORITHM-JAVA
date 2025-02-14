package BOJ.step.H23_동적_계획법_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기 : https://www.acmicpc.net/problem/1463
public class Main1463 {
    public static Integer[] dp; // count 횟수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(n));
    }

    public static int recur(int n) {
        if (dp[n] == null) {
            // 6으로 나누어지는 경우 ex) n = 12
            if (n % 6 == 0) {
                // count 횟수로는 기본적으로 1을 더해주고
                // n/2 또는 n/3으로 나누었을 때의 count 횟수와 n-1 을 했을때의 count 횟수 중 가장 작은 것
                dp[n] = Math.min(recur(n-1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            }
            // 3으로만 나눠지는 경우 ex) n = 9
            else if (n % 3 == 0) {
                // n/3 한것으로 재귀 호출하는 것과 n-1 한 것을 재귀호출 하는 것중 작은 것
                dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            }

            // 2로만 나눠지는 경우 ex) n = 10
            else if (n % 2 == 0) {
                // n/2 한것으로 재귀 호출하는 것과 n-1 한 것을 재귀호출 하는 것중 작은 것
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[n] = recur(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
