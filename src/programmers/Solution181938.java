package programmers;

// 두 수의 연산값 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181938

public class Solution181938 {
    public static int solution(int a, int b) {
        // 양의 정수 a, b를 문자 a, b로 만들기?
        // int answer = 0;
        // if ((1 <= a && a <= 10000) && (1 <= b && b <= 10000)) {
        //     String AB = Integer.toString(a) + Integer.toString(b);
        //     int twoAB = 2 * a * b;

        //    if (Integer.parseInt(AB) >= twoAB) {
        //        answer = Integer.parseInt(AB);
        //    } else {
        //        answer = twoAB;
        //     }
        // }
        // return answer;

        String leftResultStr = "" + a + b;
        int rightResult = 2 * a * b;
        int leftResult = Integer.parseInt(leftResultStr);

        return leftResult > rightResult ? leftResult : rightResult;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }
}
