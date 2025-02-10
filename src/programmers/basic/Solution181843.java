package programmers.basic;

// 부분 문자열인지 확인하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181843
public class Solution181843 {
    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    public static void main(String[] args) {
        String myString = "banana";
        String target1 = "ana";
        String target2 = "wxyz";
        System.out.println(solution(myString, target1));
        System.out.println(solution(myString, target2));

    }
}
