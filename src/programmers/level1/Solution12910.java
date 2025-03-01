package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 나누어 떨어지는 숫자 배열 : https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class Solution12910 {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int v : arr) {
            if (v % divisor == 0) {
                answer.add(v);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }

        Collections.sort(answer);
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3, 2, 6};
        int divisor1 = 5;
        int divisor2 = 1;
        int divisor3 = 10;
        System.out.println(Arrays.toString(solution(arr1, divisor1)));
        System.out.println(Arrays.toString(solution(arr2, divisor2)));
        System.out.println(Arrays.toString(solution(arr3, divisor3)));


    }
}
