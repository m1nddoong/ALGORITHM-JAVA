package programmers.level0;

// 문자열의 앞의 n글자 : https://school.programmers.co.kr/learn/courses/30/lessons/181907
public class Solution181907 {
    public static String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);;
        return answer;
    }

    public static void main(String[] args) {
        String my_string1 = "ProgrammerS123";
        int n1 = 11;
        System.out.println(solution(my_string1, n1));
        String my_string2 = "He110W0r1d";
        int n2 = 5;
        System.out.println(solution(my_string2, n2));
    }
}
