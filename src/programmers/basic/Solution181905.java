package programmers.basic;

// 문자열 뒤집기 : https://school.programmers.co.kr/learn/courses/30/lessons/181905
public class Solution181905 {
    public static String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string, 0, s);
        StringBuilder mid = new StringBuilder(my_string.substring(s, e + 1));
        mid.reverse();
        answer.append(mid);
        answer.append(my_string, e + 1, my_string.length());
        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string1 = "Progra21Sremm3";
        int s1 = 6;
        int e1 = 12;
        System.out.println(solution(my_string1, s1, e1));
        String my_string2 = "Stanley1yelnatS";
        int s2 = 4;
        int e2 = 10;
        System.out.println(solution(my_string2, s2, e2));
    }
}

