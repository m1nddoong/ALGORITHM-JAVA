package programmers.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

// 길이에 따른 연산 : https://school.programmers.co.kr/learn/courses/30/lessons/181879
public class Solution181879 {
    public static int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            answer = Arrays.stream(num_list).sum();
        }
        else {
            answer = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list2 = {2, 3, 4, 5};
        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));
    }
}
