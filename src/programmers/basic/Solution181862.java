package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 세 개의 구분자 : https://school.programmers.co.kr/learn/courses/30/lessons/181862
public class Solution181862 {
    public static String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(myStr, "\\abc");

        while (st.hasMoreTokens()) {
            answer.add(st.nextToken());
        }

        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }

        return answer.toArray(String[]::new);
    }

    public static void main(String[] args) {
        String myStr1 = "baconlettucetomato";
        String myStr2 = "abcd";
        String myStr3 = "cabab";
        System.out.println(Arrays.toString(solution(myStr1)));
        System.out.println(Arrays.toString(solution(myStr2)));
        System.out.println(Arrays.toString(solution(myStr3)));
    }
}
