package boj.study.H25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 주유소 : https://www.acmicpc.net/problem/13305
public class Main13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 도시의 개수 n = 4
        int n = Integer.parseInt(br.readLine());

        long[] dist = new long[n - 1]; // 거리
        long[] cost = new long[n]; // 비용

        // 거리 길이 = 2, 3 ,1
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) {
            // 0 2 5 6
            dist[i] = Long.parseLong(st.nextToken());
        }

        // 리터당 기름값  = 5 2 4 1
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        // 최종 금액
        long total = 0;
        long minCost = cost[0]; // 이전 까지의 과정 중 주유 최소 비용

        for (int i = 0; i < n-1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }

            total += (minCost * dist[i]);
        }
        System.out.println(total);
    }
}
