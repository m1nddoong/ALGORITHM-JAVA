package programmers.level0;

/**
 * 문자열 곱하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
public class Solution181940 {
    public static String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(solution("string", 3));
        System.out.println(solution("love", 10));
    }
}
