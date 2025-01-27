package programmers.basic;

import java.util.*;

// n 번쨰 원소부터 : https://school.programmers.co.kr/learn/courses/30/lessons/181892
public class Solution181892 {
    public static int[] solution(int[] num_list, int n) {
//        int[] answer = new int[num_list.length - (n - 1)];
//
//        for (int i = n - 1; i < num_list.length; i++) {
//            answer[i - (n - 1)] = num_list[i];
//        }
//        return answer;

        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }


    public static void main(String[] args) {
        int[] num_list1 = {2, 1, 6};
        int n1 = 3;
        System.out.println(Arrays.toString(solution(num_list1, n1)));
        int[] num_list2 = {5, 2, 1, 7, 5};
        int n2 = 2;
        System.out.println(Arrays.toString(solution(num_list2, n2)));
    }
}
