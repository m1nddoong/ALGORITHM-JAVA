package programmers.basic;

import java.util.Arrays;

// 카운트 업 : https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class Solution181920 {
    public static int[] solution(int start_num, int end_num) {

        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i < end_num - start_num + 1; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;
        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }
}
