package boj.step.H26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 종이의 개수 : https://www.acmicpc.net/problem/1780
public class Main1780 {
    public static int[][] board;
    public static int One = 0;
    public static int Zero = 0;
    public static int MinusOne = 0;

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


    // 종이 자르기 메서드
    public static void partition(int row, int col, int size) {
        // 모든 수가 같은 수로 되어있다면
        if (equalNumber(row, col, size)) {
            if (board[row][col] == 1) {
                One++;
            } else if (board[row][col] == 0) {
                Zero++;
            } else {
                MinusOne++;
            }
            return;
        }
        int newSize = size / 3;

        // 9개의 파티션을 만들어야 한다.
        partition(row, col, newSize);								// 왼쪽 위
        partition(row, col + newSize, newSize);						// 중앙 위
        partition(row, col + 2 * newSize, newSize);					// 오른쪽 위

        partition(row + newSize, col, newSize);						// 왼쪽 중간
        partition(row + newSize, col + newSize, newSize);			// 중앙 중간
        partition(row + newSize, col + 2 * newSize, newSize);		// 오른쪽 중간

        partition(row + 2 * newSize, col, newSize);					// 왼쪽 아래
        partition(row + 2 * newSize, col + newSize, newSize);		// 중앙 아래
        partition(row + 2 * newSize, col + 2 * newSize, newSize);	// 오른쪽 아래

    }

    // 종이가 모두 같은 수로 되어있는지를 체크하는 메서드
    public static boolean equalNumber(int row, int col, int size) {
        int num = board[row][col]; // (0, 0) 부터 시작

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != num) {
                    return false;
                }
            }
        }
        return true;
    }
}






