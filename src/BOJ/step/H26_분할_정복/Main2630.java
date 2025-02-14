package BOJ.step.H26_분할_정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이 만들기 : https://www.acmicpc.net/problem/2630
public class Main2630 {
    // 카운트할 색종이
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 전체 종이의 한변이 길이 N
        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);


    }


    public static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (board[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }
        int newSize = size / 2; // 절반 사이즈
        // 재귀호출
        partition(row, col, newSize);                               // 1분면
        partition(row, col+newSize, newSize);                   // 2분면
        partition(row+newSize, col, newSize);                   // 3분면
        partition(row+newSize, col+newSize, newSize);       // 4분면

    }



    // 현재 파티션의 컬러가 같은지 체크한다.
    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col]; // 첫 번쨰 원소를 기준으로 검사
        for (int i = row; i < row+size; i++) {
            for (int j = col; j < col+size; j++) {
                // 색상이 같은 게 없다면 false 리턴
                if (board[i][j] != color) {
                    return false;
                }

            }

        }
        // 검사 모두 통과 : true
        return true;
    }
}

/**
 *  부분 색종이는 모두 같은 색상이야한다.
 *  만약 모두 같은 색상이 아닐 경우, 색종이를 잘라야 한다.
 */