package programmers.basic;

// 문자열을 정수로 변환하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181848
public class Solution181848 {
    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
    public static void main(String[] args) {
        String n_str1 = "10";
        String n_str2 = "8542";
        System.out.println(solution(n_str1));
        System.out.println(solution(n_str2));
    }
}
