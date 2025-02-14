package BOJ.step.H25_그리디_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전 0 : https://www.acmicpc.net/problem/11047
public class Main11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        // n개의 줄에 동전의 가치 A_j 가 오름차순으로 주어진다.
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }


        int count = 0;
        // k원을 만드는데 필요한 동전의 개수의 최솟값 출력
        // 비싼 동전부터 채워넣어보자.
        for (int i = n-1; i >= 0 ; i--) {
            while (k >= coin[i]) { // coin[6] = 1000원에서 걸림
                k -= coin[i]; // 4200 - 1000 = 3200
                count++;
            }
        }
        System.out.println(count);
    }
}
