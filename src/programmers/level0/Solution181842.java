package programmers.level0;

// 부분 문자열 : https://school.programmers.co.kr/learn/courses/30/lessons/181842
public class Solution181842 {
    public static int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
    public static void main(String[] args) {
        String strA1 = "abc";
        String strA2 = "aabcc";
        System.out.println(solution(strA1, strA2));
        String strB1 = "tbt";
        String strB2 = "tbbttb";
        System.out.println(solution(strB1, strB2));
    }
}
