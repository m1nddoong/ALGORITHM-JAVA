package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// n개 간격의 원소들 : https://school.programmers.co.kr/learn/courses/30/lessons/181888
public class Solution181888 {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n1 = 2;
        System.out.println(Arrays.toString(solution(num_list, n1)));
        int n2 = 4;
        System.out.println(Arrays.toString(solution(num_list, n2)));
    }
}
