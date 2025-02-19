package programmers.알고리즘_고득점_Kit.N04_정렬;

import java.util.Arrays;


// 가장 큰 수 : https://school.programmers.co.kr/learn/courses/30/lessons/42746
public class Solution42746 {
    public static String solution(int[] numbers) {
        String[] nums = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        if (nums[0].equals("0")) return "0";

        return String.join("", nums);
    }

    public static void main(String[] args) {
        int[] numbers1 = {6, 10, 2};
        System.out.println(solution(numbers1));
        int[] numbers2 = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers2));
    }
}
