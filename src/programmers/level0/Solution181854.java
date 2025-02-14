package programmers.level0;

import java.util.Arrays;

// 배열의 길이에 따라 다른 연산하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181854
public class Solution181854 {
    public static int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] += n;
            }
        }
        else {
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] += n;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {49, 12, 100, 276, 33};
        int n1= 27;
        System.out.println(Arrays.toString(solution(arr1, n1)));
        int[] arr2 = {444, 555, 666, 777};
        int n2 = 100;
        System.out.println(Arrays.toString(solution(arr2, n2)));

    }
}
