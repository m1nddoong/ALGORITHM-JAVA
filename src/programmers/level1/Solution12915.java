package programmers.level1;

import java.util.Arrays;

// 문자열을 내 마음대로 정렬하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class Solution12915 {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            char charA =  a.charAt(n);
            char charB = b.charAt(n);
            if (charA == charB) {
                return a.compareTo(b); // String 클래스의 compareTo()
            }
            return charA - charB;
        });

        return strings;
    }
    public static void main(String[] args) {
        String[] strings1 = {"sun", "bed", "car"};
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n1 = 1;
        int n2 = 2;
        System.out.println(Arrays.toString(solution(strings1, n1)));
        System.out.println(Arrays.toString(solution(strings2, n2)));
    }
}
