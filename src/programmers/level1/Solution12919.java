package programmers.level1;

import java.util.Arrays;

// 서울에서 김서방 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Solution12919 {
    public static String solution(String[] seoul) {
        /*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seoul.length; i++) {
            // seoul[i] == "Kim" -> 오답
            if (seoul[i].equals("Kim")) {
                sb.append("김서방은 ").append(i).append("에 있다");
            }
        }
        return sb.toString();
        */
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";

    }
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}
