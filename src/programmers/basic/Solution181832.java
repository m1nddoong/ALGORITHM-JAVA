package programmers.basic;

import java.util.Arrays;

// 정수를 나선형으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181832
public class Solution181832 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1;
        int start = 0;
        int end = n;

        while (num <= n * n) {
            //>
            for (int j = start; j < end; j++) {
                answer[start][j] = num++;
            }
            //v
            for (int i = start + 1; i < end; i++) {
                answer[i][end-1] = num++;
            }
            //<
            for (int j = end - 2; j >= start; j--) {
                answer[end - 1][j] = num++;
            }
            //^
            for (int i = end - 2; i > start; i--) {
                answer[i][start] = num++;
            }
            start++;
            end--;
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 4;
        System.out.println(Arrays.deepToString(solution(n1)));
        int n2 = 5;
        System.out.println(Arrays.deepToString(solution(n2)));
    }
}
