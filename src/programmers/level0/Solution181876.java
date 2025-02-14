package programmers.level0;

// 소문자로 바꾸기 : https://school.programmers.co.kr/learn/courses/30/lessons/181876
public class Solution181876 {
    public static String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        String myString1 = "aBcDeFg";
        String myString2 = "aaa";
        System.out.println(solution(myString1));
        System.out.println(solution(myString2));
    }
}
