package programmers.level0;

import java.util.*;

public class Solution181835 {
    public static int[] solution(int[] arr, int k) {
        /*
        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        }
        // 짝수면
        else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        }
        return arr;
         */

        // stream 사용
        return Arrays.stream(arr)
                .map(n -> (k % 2 == 1) ? n * k : n + k)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 3;
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}
