package programmers.알고리즘_고득점_Kit.N04_정렬;

import java.util.Arrays;

// H-Index : https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class Solution42747 {
    public static int solution(int[] citations) {
        Arrays.sort(citations); // 0 1 3 5 6

        int max = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            // "h번 이상 인용된 논문이 h편 이상"
            int h = citations[i]; // 현재 논문의 인용 횟수
            int n = citations.length - i; // 현재 논문을 포함해 그 뒤에 있는 논문 수

            int min = Math.min(h, n);
            if (max < min) max = min;
        }
        return max;

        // ex) i = 4,
        // 현재 논문 : citations[4] = 6
        // citations.length - i = 5 - 4 = 1
        // -> 6이상 인용 편수가 1개 라는 말

        // ex) i = 3,
        // 현재 논문 : citations[3] = 5;
        // citations.length - i = 5 - 3 = 2
        // -> 5이상 인용 편수가 2개 라는 말
    }

    public static void main(String[] args) {
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println(solution(citations1));
    }
}
