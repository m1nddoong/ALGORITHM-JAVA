package boj.study.H23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 신나는 함수 실행 : https://www.acmicpc.net/problem/9184
public class Main9184 {
    static int[][][] dp = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        while (true) {
            input = br.readLine();
            int[] num = new int[3];
            for (int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(input.split(" ")[i]);
            }
            // -1 -1 -1 일 경우 stop
            if(num[0] == -1 && num[1] == -1 && num[2] == -1) break;
            sb.append(String.format("w(%d, %d, %d) = ", num[0], num[1], num[2])).append(w(num[0], num[1], num[2]))
                    .append("\n");
        }
        System.out.println(sb);
    }


    public static int w(int a, int b, int c) {

        // a, b, c가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
        if (inRange(a, b, c) && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }


        // 반복문 시작전 가장 작은 문제들 초기화
        // a, b, c, 중 하나라도 0보다 작거나 같을 경우 1 리턴
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        // a, b, c 중 하나라도 20 이상인 수가 있다면
        if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20,20,20);
        }

        // 조건에 맞게 계산
        if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    /*
     *  배열을 참조하려 할 때 a, b, c 중 하나라도 범위 밖의 수가
     *  나올 수 있기 때문에 이를 체크를 해주기 위한 함수다.
     */
    static boolean inRange(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}
