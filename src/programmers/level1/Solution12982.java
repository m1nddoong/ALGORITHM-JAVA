package programmers.level1;

import java.util.Arrays;

// 예산 : https://school.programmers.co.kr/learn/courses/30/lessons/12982
public class Solution12982 {
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        int sum = 0;
        int idx = -1;
        while (++idx < d.length) {
            sum += d[idx];
            if (sum > budget) break;
            cnt++;
            if (sum >= budget) break;
        }
        return cnt++;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 3, 2, 5, 4}; // 부서별 신청 금액
        int budget1 = 9; // 예산
        System.out.println(solution(d1, budget1));
        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        System.out.println(solution(d2, budget2));
    }
}
