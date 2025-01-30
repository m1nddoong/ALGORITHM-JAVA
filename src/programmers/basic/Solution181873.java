package programmers.basic;

// 특정한 문자를 대문자로 바꾸기 : https://school.programmers.co.kr/learn/courses/30/lessons/181873
public class Solution181873 {
    public static String solution(String my_string, String alp) {
        // return my_string.replace(alp.charAt(0), (char) (alp.charAt(0) - 32));
        return my_string.replace(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        String my_string1 = "programmers";
        String alp1 = "p";
        System.out.println(solution(my_string1, alp1));
        String my_string2 = "lowercase";
        String alp2 = "x";
        System.out.println(solution(my_string2, alp2));
    }
}
