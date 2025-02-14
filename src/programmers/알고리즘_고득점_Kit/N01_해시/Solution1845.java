package programmers.알고리즘_고득점_Kit.N01_해시;

import java.util.*;

// 폰켓몬 : https://school.programmers.co.kr/learn/courses/30/lessons/1845
/*
        3 1 2 3 이 있으면 이중에서 2개를 골라야함
        해시맵으로 정리하면 키값은 3개가 됨 -> 1 2 3
        이중에 2개를 고를 수있는거임 1 2

        만약 1 1 1 1 2 2 2 2 라면
        이중에 4개를 뽑아야하는데 종류는 2가지 1 2 임
        그러면 종루의 수는 그냥 2개임 (최대한 많은 종류를 뽑으려 할테니)

        만약 12345678 중에 4개 뽑아야하는데 종류가 8개임 그러면
        여기서 가장 많은 종류의 포켓몬을 뽑을 가지수는 4개임
*/
public class Solution1845 {
    public static int solution(int[] nums) {
        // 고를수있는 폰켓몬 종류의 수
        int answer = 0;

        // 선택할수있는 폰켓몬의 개수 (2마리를 고를수있음)
        int select = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            int value = map.get(num);
            map.put(num, ++value);
        }

        int n = map.keySet().size();
        answer = Math.min(n, select);
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
        System.out.println(solution(nums3));

    }
}
