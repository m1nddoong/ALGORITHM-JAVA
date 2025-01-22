package programmers.basic;

import java.util.Arrays;

// 문자 개수 세기 : https://school.programmers.co.kr/learn/courses/30/lessons/181902
public class Solution181902 {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c : my_string.toCharArray()) {
            // 'A' = 65 ~ 'Z' = 90
            // 0 ~ 25 (1 ~ 26)
            if ((int) c >= 65 && (int) c <= 90) {
                answer[(int) c - 65]++;
            }
            // 'a' = 97 ~ 'z' = 122
            // 26 ~ 51 (27 ~ 52)
            else {
                answer[(int) c - 71]++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "Programmers";
        System.out.println(Arrays.toString(solution(my_string)));
    }
}
