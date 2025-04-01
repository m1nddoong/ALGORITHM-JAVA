package BOJ.step.H22_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// [실버 1] 연산자 끼워넣기 : https://www.acmicpc.net/problem/14888
public class Main14888 {
    public static int MAX = Integer.MIN_VALUE;    // 최댓값
    public static int MIN = Integer.MAX_VALUE;    // 최솟값
    public static int[] operator = new int[4];    // 연산자(+, -, *, /)의 개수
    public static int[] number;                    // 숫자
    public static int N;                        // 숫자 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        number = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, number[0]);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void dfs(int depth, int sum) {
        if (depth == N) {
            MAX = Math.max(MAX, sum);
            MIN = Math.min(MIN, sum);
            return;
        }

        for (int i = 0; i < operator.length; i++) {
            if (operator[i] > 0) { // 가지치기
                operator[i]--;

                int newSum = calculate(sum, number[depth],  i);
                dfs(depth + 1, newSum);

                operator[i]++;
            }
        }
    }

    public static int calculate(int a, int b, int op) {
        switch (op) {
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            case 3: return a < 0 ? -(Math.abs(a) / b) : a / b;
        }
        return 0;
    }

}
