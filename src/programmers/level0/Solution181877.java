package programmers.level0;

// 대문자로 바꾸기 : https://school.programmers.co.kr/learn/courses/30/lessons/181877
public class Solution181877 {
    public static String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        String myString1 = "aBcDeFg";
        String myString2 = "AAA";
        System.out.println(solution(myString1));
        System.out.println(solution(myString2));

    }
}
