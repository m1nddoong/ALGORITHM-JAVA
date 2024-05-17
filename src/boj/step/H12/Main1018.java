package boj.step.H12;

import java.io.*;
import java.util.*;


// 체스판 다시 칠하기 : https://www.acmicpc.net/problem/1018
public class Main1018 {
    public static boolean[][] arr;
    public static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;

        boolean check = arr[x][y]; // 좌상단에 위치한 정사각형이 무슨 색인지

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                // 만약 인접한 정사각형이 같은 색이라면 카운트
                if (arr[i][j] != check) {
                    cnt++;
                }
                check = !check;
            }
            check = !check;
        }

        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}

