package programmers.basic;

import java.util.Arrays;
import java.util.Stack;

// 배열 만들기 6 : https://school.programmers.co.kr/learn/courses/30/lessons/181859
public class Solution181859 {
    public static int[] solution(int[] arr) {
        Stack<Integer> answer = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty()) {
                answer.push(arr[i]);
            } else if (answer.lastElement() == arr[i]) {
                answer.pop();
            } else {
                answer.push(arr[i]);
            }
        }

        if (answer.isEmpty()) answer.push(-1);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 1, 0};
        int[] arr2 = {0, 1, 0, 1, 0};
        int[] arr3 = {0, 1, 1, 0};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
    }
}
