package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열의 원소만큼 추가하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181861
public class Solution181861 {
    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 4};
        int[] arr2 = {6, 6};
        int[] arr3 = {1};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
    }
}
