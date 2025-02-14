package programmers.level0;

import java.util.Arrays;

// 정수 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/181840
public class Solution181840 {
    public static int solution(int[] num_list, int n) {
        /*
        int answer = 0;
        for (int num : num_list) {
            if (num == n) {
                answer = 1;
                break;
            }
        }
        return answer;
         */

        return Arrays.stream(num_list)
                .anyMatch(num -> num == n) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5};
        int n1 = 3;
        System.out.println(solution(num_list1, n1));
        int[] num_list2 = {15, 98, 23, 2, 15};
        int n2 = 20;
        System.out.println(solution(num_list2, n2));
    }
}
