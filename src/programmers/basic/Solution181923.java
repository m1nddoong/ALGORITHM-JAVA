package programmers.basic;

import java.util.Arrays;

// 수열과 구간 쿼리 2 : https://school.programmers.co.kr/learn/courses/30/lessons/181923
public class Solution181923 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];


        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            boolean success = false;
            int min = 1000000;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                    success = true;
                }
            }
            answer[i] = success ? min : -1;

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
