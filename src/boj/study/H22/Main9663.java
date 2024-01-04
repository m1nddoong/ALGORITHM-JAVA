package boj.study.H22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N-Queen : https://www.acmicpc.net/problem/9663
public class Main9663 {
    public static int count = 0;
    public static int[] arr;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0); // 0 행 부터 시작
        System.out.println(count);
    }

    public static void nQueen(int depth) {
        // 퀸 N개를 모두 놓았다면 - 경우의 수 1 증가
        if (depth == N) {
            count++;
            return;
        }

        // 그게 아니라면
        // 해당 행(depth)에서 각 열(i)들을 고른다
        for (int i = 0; i < N; i++) {
            // depth 번째 행에서 열의 값을 i로 선택 (0,0으로 골랐으면 i=0 을 저장한 것)
            arr[depth] = i;

            // 놓을 수 있는 위치일 경우 재귀호출
            if (Possibility(depth)) { // depth 번째 행의 열들이 유망한가?
                nQueen(depth + 1);
            }
        }
    }

    // 유망성 판단
    public static boolean Possibility(int row) {
        for (int i = 0; i < row; i++) {
            // 1. 같은 열에 존재할 경우
            // 해당 행의 열과 i행의 열이 일치할경우
            if (arr[row] == arr[i]) {
                return false;
            }

            // 2. 같은 대각선상에 놓여있는 경우
            // (행의 차와 열의 차가 같을 경우가 대각선에 놓여있는 경우이다)
            else if (Math.abs(row - i) == Math.abs(arr[row] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}