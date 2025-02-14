package programmers.level0;

import java.util.Arrays;

// 마지막 두 원소 : https://school.programmers.co.kr/learn/courses/30/lessons/181927
public class Solution181927 {
    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }

        int end = num_list[len - 1] > num_list[len - 2] ? num_list[len - 1] - num_list[len - 2] : 2 * num_list[len - 1];
        answer[len] = end;

        return answer;
    }


    public static void main(String[] args) {
        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(solution(num_list1)));
        System.out.println(Arrays.toString(solution(num_list2)));


    }
}
