package programmers.level1;

// 문자열을 정수로 바꾸기 : https://school.programmers.co.kr/learn/courses/30/lessons/12925
public class Solution12925 {
    public static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        String str = "-1234";
        System.out.println(solution(str));
    }
}
