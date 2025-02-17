package programmers.알고리즘_고득점_Kit.N04_정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

// 가장 큰 수 : https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class Solution42746 {
    public static String solution(int[] numbers) {
        String answer = "";
        List<Integer> nums = new ArrayList<>();
        for (int num : numbers) {
            nums.add(num);
        }
        // 10 이하면서 가장 큰수는 첫번쨰 자리수로 배치
        int first = 0;
        for (int num : nums) {
            if ((first < num) && (num / 10 == 0)) {
                first = num;
                System.out.println(num);
            }
        }
        answer += first;

        // 가장 왼쪽의 숫자가 큰 순서대로 정렬


        return answer;
    }

    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        System.out.println(solution(numbers1));
//        int[] numbers2 = {3, 30, 34, 5, 9};
//        System.out.println(solution(numbers2));
    }
}
