package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열의 길이를 2의 거듭제곱으로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/181857
public class Solution181857 {
    public static int[] solution(int[] arr) {
//        List<Integer> answer = new ArrayList<>();
//
//        int idx = 0;
//        for (int i = 2; i <= 1024; i *= 2) {
//            if (arr.length == 1) {
//                idx = 1;
//                break;
//            }
//            if (arr.length <= i) {
//                idx = i;
//                break;
//            }
//
//        }
//
//        for (int j = 0; j < idx; j++) {
//            if (j >= arr.length) {
//                answer.add(0);
//            } else {
//                answer.add(arr[j]);
//            }
//        }
//
//        return answer.stream().mapToInt(i -> i).toArray();

        int length = 1;
        while (length < arr.length) {
            length *= 2;
        }
        return Arrays.copyOf(arr, length);

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {58, 172, 746, 89};
        int[] arr3 = {1};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
    }
}
