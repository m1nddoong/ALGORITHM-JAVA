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
        int m = Integer.parseInt(st.nextToken());

        // 1번부터 n번까지의 바구니 (가장 오른쪽 바구니를 n번째 바구니)
        int[] basket = new int[n];

        for (int i = 0; i < n; i++) {
            basket[i] = i+1;  // 0번인덱스가 1번 바구니 -> 1 들어있음
        }

        // 바구니의 순서를 역순으로 만드는 방법들 (i, j)
        for (int k = 0; k < m; k ++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1; // i번째부터
            int j = Integer.parseInt(st.nextToken()) - 1; // j번째까지 순서 역순

            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(basket[k] + " ");
        }

    }
}
