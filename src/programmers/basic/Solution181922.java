package programmers.basic;

import java.util.Arrays;

// 수열과 구간 쿼리 4 : https://school.programmers.co.kr/learn/courses/30/lessons/181922
public class Solution181922 {
    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            // j 가 k 의 배수이면 arr[j]에 1 을 더하기
            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    arr[j] ++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
