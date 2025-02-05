package programmers.basic;

import java.util.Arrays;

// 뒤에서 5등까지 : https://school.programmers.co.kr/learn/courses/30/lessons/181853
public class Solution181853 {
    public static int[] solution(int[] num_list) {
//        int[] answer = new int[5];

        Arrays.sort(num_list);
//        for (int i = 0; i < 5; i++) {
//            answer[i] = num_list[i];
//        }

//        return answer;
        return Arrays.copyOfRange(num_list, 0, 5);
    }
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
