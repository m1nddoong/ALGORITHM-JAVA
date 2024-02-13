package boj.study.H26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 종이의 개수 : https://www.acmicpc.net/problem/1780
public class Main1780 {
    public static int[][] board;
    public static int One;
    public static int Zero;
    public static int MinusOne;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, n);
        System.out.println(MinusOne);
        System.out.println(Zero);
        System.out.println(One);


    }



    // 1. 만약 종이가 모두 같은 수도 되어 있다면
    public static void partition(int row, int col, int size) {
        if (!equalNumber(row, col, size)) {
            if (board[row][col] == 1) {
                One++;
            } else if (board[row][col] == 0) {
                Zero++;
            } else {
                MinusOne++;
            }
            int newSize = size / 3;

            partition(row, col, newSize);
            partition(row, col+newSize, newSize);
            partition(row, col+newSize+newSize, newSize);
            partition(row+newSize, col, newSize);
            partition(row+newSize, col+newSize, newSize);
            partition(row+newSize, col+newSize+newSize, newSize);
            partition(row+newSize+newSize, col, newSize);
            partition(row+newSize+newSize, col+newSize, newSize);
            partition(row+newSize+newSize, col+newSize+newSize, newSize);
        }
    }



    public static boolean equalNumber(int row, int col, int size) {
        // 동일한 숫자로 이루어져 있는지 확인
        int num = board[row][col];

        for (int i = 0; i < row+size; i++) {
            for (int j = 0; j < col+size; j++) {
                if (board[i][j] != num) {
                    return false;
                }

            }

        }
        return true;
    }
}






