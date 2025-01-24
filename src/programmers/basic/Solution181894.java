package programmers.basic;

import java.util.*;

// 2의 영역 : https://school.programmers.co.kr/learn/courses/30/lessons/181894
public class Solution181894 {
    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> idxQ = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                idxQ.add(i);
            }
        }

        if (!idxQ.isEmpty()) {
            for (int i = idxQ.getFirst(); i <= idxQ.getLast(); i++) {
                answer.add(arr[i]);
            }
        }
        else {
            answer.add(-1);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
        System.out.println(Arrays.toString(solution(arr4)));
    }
}
