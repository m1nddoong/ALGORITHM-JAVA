package programmers.level0;

/**
 * 주사위 게임 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181839
 */
public class Solution181839 {
    public static int solution(int a, int b) {
        int answer = 0;

        if (a % 2 == 1 && b % 2 == 1) {
            answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(6, 1));
        System.out.println(solution(2, 4));
    }
}
