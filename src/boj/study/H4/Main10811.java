package boj.study.H4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바구니 뒤집기 : https://www.acmicpc.net/problem/10811
public class Main10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        // 1번부터 n번까지의 바구니 (가장 오른쪽 바구니를 n번째 바구니)
        int[] basket = new int[n+1];
        for (int i = 1; i <= n; i++) {
            // 0번 (= 1번 바구니) ~ n-1번(= n번 바구니)
            basket[i] = i;
        }

        int m = Integer.parseInt(st.nextToken());

        // 바구니의 순서를 역순으로 만드는 방법들 (i, j)
        for (int k = 1; k <= m; k ++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // i번째부터
            int j = Integer.parseInt(st.nextToken()); // j번째까지 순서 역순

        }
    }
}
