package programmers.level0;

import java.util.Arrays;

// 수열과 구간 쿼리 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181883
public class Solution181883 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j]++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
