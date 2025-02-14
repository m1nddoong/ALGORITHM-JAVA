package programmers.level0;

import java.util.Arrays;

// 원소들의 곱과 합 : https://school.programmers.co.kr/learn/courses/30/lessons/181929
public class Solution181929 {
    public static int solution(int[] num_list) {
        int answer = 0;

        int mul = Arrays.stream(num_list)
                .reduce(1, (a, b) -> a * b);


        int sum = Arrays.stream(num_list)
                .sum();

        answer = mul < sum * sum ? 1 : 0;

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 1};
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));
    }
}
