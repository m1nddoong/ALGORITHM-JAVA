package programmers.basic;

import java.util.*;

// 순서 바꾸기 : https://school.programmers.co.kr/learn/courses/30/lessons/181891
public class Solution181891 {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }

        // 다른 풀이
        // 0 1 2 -> 1 2 0
        // (i + n) % arr.length 로 매핑
        // return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] num_list1 = {2, 1, 6};
        int n1 = 1;
        System.out.println(Arrays.toString(solution(num_list1, n1)));
        int[] num_list2 = {5, 2, 1, 7, 5};
        int n2 = 3;
        System.out.println(Arrays.toString(solution(num_list2, n2)));
    }
}
