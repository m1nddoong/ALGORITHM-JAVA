package BOJ.step.H19_조합론;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());
        for (int i = 0; i < T; i++) {
            String input = reader.readLine();
            int n = Integer.parseInt(input.split(" ")[1]);
            int r = Integer.parseInt(input.split(" ")[0]);
            writer.write(BC(n, r) + "\n");
        }
        writer.flush();
    }


    private static int[][] dp = new int[30][30];

    public static int BC(int n, int r) { // 이항 계수(조합)
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        // return BC(n - 1, r - 1) + BC(n - 1, r); -> 이렇게 하면 시간초과
        int result = BC(n - 1, r - 1) + BC(n - 1, r);
        // 중복 계산을 피하기 위해 저장
        dp[n][r] = result;
        return result;
    }
}

