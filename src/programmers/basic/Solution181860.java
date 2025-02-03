package programmers.basic;

import java.util.*;

// 빈 배열에 추가, 삭제하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181860
public class Solution181860 {
    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int k = 0; k < arr[i] * 2; k++) {
                    answer.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.pop();
                }
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(solution(arr, flag)));
    }
}
