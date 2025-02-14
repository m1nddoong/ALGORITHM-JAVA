package programmers.level0;

import java.util.Arrays;

// 배열 비교하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181856
public class Solution181856 {
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length == arr2.length) {
            int a = Arrays.stream(arr1).sum();
            int b = Arrays.stream(arr2).sum();
            if (a > b) {
                answer = 1;
            }
            else if (a < b) {
                answer = -1;
            }
        }
        else {
            answer = arr1.length > arr2.length ? 1 : -1;

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arrA1 = {49, 13};
        int[] arrA2 = {70, 11, 2};
        System.out.println(solution(arrA1, arrA2));
        int[] arrB1 = {100, 17, 84, 1};
        int[] arrB2 = {55, 12, 65, 36};
        System.out.println(solution(arrB1, arrB2));
        int[] arrC1 = {1, 2, 3, 4 ,5};
        int[] arrC2 = {3, 3, 3, 3, 3};
        System.out.println(solution(arrC1, arrC2));

    }
}

