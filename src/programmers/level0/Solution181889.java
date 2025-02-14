package programmers.level0;

import java.util.Arrays;

// n 번째 원소까지 : https://school.programmers.co.kr/learn/courses/30/lessons/181889
public class Solution181889 {
    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
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
