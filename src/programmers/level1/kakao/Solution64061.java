package programmers.level1.kakao;

import java.util.ArrayDeque;

// 크레인 인형뽑기 게임 : https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Solution64061 {
    public static int solution(int[][] board, int[] moves) {
        int count = 0; // 터진 인형의 개수
        ArrayDeque<Integer> stack = new ArrayDeque<>(); // 바구니

        // 몇번 "위치(move[i])" 에서 인형을 집을 것인지
        for (int i = 0; i < moves.length; i++) {
            // 위치가 1이다 ! 하면 board 에서 인덱스가 0인 부분만 탐색하고, 그중에 값이 0이 아닌 값 채택
            int position = moves[i] - 1;
            System.out.println("1. " + (position + 1) + "번 크레인에서 뽑기");
            for (int j = 0; j < board.length; j++) {
                if (board[j][position] != 0) {
                    int target = board[j][position];
                    System.out.println("2. 뽑힌 인형의 숫자는: " + target);
                    // 바구니 검사 : 기존 꼭대기와 새로 들어온 녀석이 같으면 펑!
                    if (!stack.isEmpty() && stack.peek() == target) {
                        System.out.println("3. 방금 뽑힌 인형이 바구니 꼭대기의 인형과 겹치네! 펑!");
                        stack.pop();
                        count++;
                    } else {
                        stack.push(target);
                    }
                    board[j][position] = 0;
                    break;
                }
            }
            System.out.println("현재 바구니 상황 : " + stack);
            System.out.println();
        }

        return count * 2;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }
}
