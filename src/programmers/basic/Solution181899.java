package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 카운트 다운 : https://school.programmers.co.kr/learn/courses/30/lessons/181899
public class Solution181899 {
    public static int[] solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();
        for (int i = start_num; i >= end_num; i--) {
            answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;
        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }
}
