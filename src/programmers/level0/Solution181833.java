package programmers.level0;

import java.util.Arrays;

// 특별한 이차원 배열 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181833
public class Solution181833 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 3;
        System.out.println(Arrays.deepToString(solution(n1)));
        int n2 = 6;
        System.out.println(Arrays.deepToString(solution(n2)));
        int n3 = 1;
        System.out.println(Arrays.deepToString(solution(n3)));
    }
}
