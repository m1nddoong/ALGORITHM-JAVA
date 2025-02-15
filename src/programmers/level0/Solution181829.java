package programmers.level0;

// 이차원 배열 대각선 순회하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181829
public class Solution181829 {
    public static int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board1 = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
        int k1 = 2;
        System.out.println(solution(board1, k1));
    }
}
