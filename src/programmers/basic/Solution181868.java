package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 공백으로 구분하기 2 : https://school.programmers.co.kr/learn/courses/30/lessons/181868
public class Solution181868 {
    public static String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(my_string);
        while (st.hasMoreTokens()) {
            answer.add(st.nextToken());
        }

        return answer.toArray(String[]::new);
    }

    public static void main(String[] args) {
        String my_string1 = " i    love  you";
        System.out.println(Arrays.toString(solution(my_string1)));
        String my_string2 = "    programmers  ";
        System.out.println(Arrays.toString(solution(my_string2)));
    }
}

