package programmers.level0;

import java.util.Arrays;

// 접미사 배열 : https://school.programmers.co.kr/learn/courses/30/lessons/181909
public class Solution181909 {
    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = "\"" + my_string.substring(i) + "\"";
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        String my_string1 = "banana";
        System.out.println(Arrays.toString(solution(my_string1)));
        String my_string2 = "programmers";
        System.out.println(Arrays.toString(solution(my_string2)));
    }
}
