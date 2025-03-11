package programmers.level1;

import java.util.Arrays;

// 행렬의 덧셈 : https://school.programmers.co.kr/learn/courses/30/lessons/12950
public class Solution12950 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int rowSize = arr1.length;
        int colSize = arr1[0].length;
        int[][] answer = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arrA1 = {{1, 2}, {2, 3}};
        int[][] arrA2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(solution(arrA1, arrA2)));
        int[][] arrB1 = {{1}, {2}};
        int[][] arrB2 = {{3}, {4}};
        System.out.println(Arrays.deepToString(solution(arrB1, arrB2)));
    }
}
