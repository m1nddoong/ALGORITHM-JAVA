package boj.study.H24;

// 구간 합 구하기 4 : https://www.acmicpc.net/problem/11659

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int n = Integer.parseInt(input.split(" ")[0]); // 수의 개수 n
        int m = Integer.parseInt(input.split(" ")[1]); // 합을 구해야 하는 횟수 m

        // 누적합을 담을 배열
        int[] arr = new int[n+1];

        // 모든 n개의 숫자에 대해서 누적합 구하기
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            for (int i = 0; i < n; i++) {
                arr[i+1] = arr[i] + Integer.parseInt(st.nextToken());
            }
        }

        // 구간 i, j 를 m번 입력받기
        for (int k = 0; k < m; k++) {
            input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            // 합을 구해야 하는 횟수 m
            int b = Integer.parseInt(input.split(" ")[1]);
            // 인덱스 i-1 부터 j-1 까지의 합을 구하면 된다. (1, 3) -> 1부터 3까지
            System.out.println(arr[b] - arr[a-1]);

        }
    }
}
