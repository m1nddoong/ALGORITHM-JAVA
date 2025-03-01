package programmers.level1;

// 문자열 다루기 기본 : https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Solution12918 {
    public static boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    answer = false;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }

}
