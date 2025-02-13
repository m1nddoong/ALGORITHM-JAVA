package programmers.basic;

import java.util.Arrays;

// 정사각형으로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/181830
public class Solution181830 {
    public static int[][] solution(int[][] arr) {
        int row = arr[0].length;
        int col = arr.length;
        int size = row > col ? row : col;
        int[][] answer = new int[size][size];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] arr3 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(solution(arr1)));
        System.out.println(Arrays.deepToString(solution(arr2)));
        System.out.println(Arrays.deepToString(solution(arr3)));
    }
}
