package programmers.level0;

import java.util.Arrays;

// 수열과 구간 쿼리 3 : https://school.programmers.co.kr/learn/courses/30/lessons/181924
public class Solution181924 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
