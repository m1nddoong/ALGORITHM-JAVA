package programmers.basic;

import java.util.*;

// 무작위로 K개의 수 뽑기 : https://school.programmers.co.kr/learn/courses/30/lessons/181858
public class Solution181858 {
    public static int[] solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int value : arr) {
            if (!answer.contains(value) && answer.size() != k) {
                answer.add(value);
            }
        }
//        if (answer.size() < k) {
//            for (int i = 0; i <= k - answer.size(); i++) {
//                answer.add(-1);
//            }
//        }

        for (int i = answer.size(); i < k; i++) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i -> i).toArray();

    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 2, 2, 3};
        int k1 = 3;
        System.out.println(Arrays.toString(solution(arr1, k1)));
        int[] arr2 = {0, 1, 1, 1, 1};
        int k2 = 4;
        System.out.println(Arrays.toString(solution(arr2, k2)));
    }
}
