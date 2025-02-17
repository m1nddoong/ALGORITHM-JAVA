package programmers.알고리즘_고득점_Kit.N02_스택_큐;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 같은 숫자는 싫어 : https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Solution12906 {
    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int v : arr) {
            if (stack.isEmpty() || stack.peek() != v) {
                stack.push(v);
                System.out.println("push : " + v);
                answer.add(v);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println();
        System.out.println(Arrays.toString(solution(arr2)));


    }
}
