package programmers.알고리즘_고득점_Kit.N07_동적계획법;

// N으로 표현 : https://school.programmers.co.kr/learn/courses/30/lessons/42895
public class Solution42895 {
    /* ex)
      [N = 5, number 25]
      > 5 * 5
      > 5 + 5 + 5 + 5 + 5
      > 55 - 5 - (5 * 5)
    */
    public static int solution(int N, int number) {
        // 최소 횟수로 N을 사용하여 사칙연산만을 이용한 number 를 만들어내기
        int count = 0; // N 사용횟수
        int result = 0; // 조합의 결과

        // Sol) 5를 가지고 계산을 한 결과의 값을 저장해서 반복하기
        // Q) 좌항 우항을 나눠서 생각

        return count;
    }

    public static void main(String[] args) {
        int N1 = 5;
        int number1 = 12;
        System.out.println(solution(N1, number1));
        int N2 = 2;
        int number2 = 11;
        System.out.println(solution(N2, number2));
    }
}
