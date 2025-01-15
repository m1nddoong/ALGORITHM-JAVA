package programmers.basic;

import java.util.*;

// 배열 만들기 4 : https://school.programmers.co.kr/learn/courses/30/lessons/181918
public class Solution181918 {
    public static int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i : arr) {
            if (stk.isEmpty()) {
                stk.push(i);
            }
            else {
                while (!stk.isEmpty() && stk.peek() >= i) {
                    stk.pop();
                }
                stk.push(i);
            }
        }

        return stk.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
