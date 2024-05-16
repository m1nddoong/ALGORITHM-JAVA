package boj.permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모든 순열 : https://www.acmicpc.net/problem/10974
public class Main10974 {
    public static void permRecurHelper(
            int n, int r,
            int depth,
            boolean[] used,
            int[] perm
    ) {
        StringBuilder sb = new StringBuilder();
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                sb.append(perm[i]).append(" ");
            }
            System.out.println(sb);
        } else {
            for (int i = 1; i <= n; i++) {
                if (used[i]) {
                    continue;
                }
                perm[depth] = i;
                used[i] = true;
                permRecurHelper(n, r, depth + 1, used, perm);
                used[i] = false;
            }
        }
    }

    public static void permRecur(int n, int r) {
        permRecurHelper(n, r, 0, new boolean[n + 1], new int[r]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        permRecur(n, n);
    }
}
