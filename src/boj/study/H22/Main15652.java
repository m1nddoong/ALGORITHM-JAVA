package boj.study.H22;

// N과 M(4) : https://www.acmicpc.net/problem/15652

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15652 {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];       // M개를 고를 수열을 담을 배열
        visit = new boolean[N]; // 유망성 판단
        dfs(N, M, 0, 0);    // 깊이 0부터 시작
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth, int start) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            arr[depth] = i+1;
            dfs(N, M, depth + 1, i);
        }
    }
}
