package programmers.level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자 : https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class Solution12954 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i ++) {
            answer[i - 1] = (long) x * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x1 = 2;
        int n1 = 5;
        System.out.println(Arrays.toString(solution(x1, n1)));
        int x2 = 4;
        int n2 = 3;
        System.out.println(Arrays.toString(solution(x2, n2)));
        int x3 = -4;
        int n3 = 2;
        System.out.println(Arrays.toString(solution(x3, n3)));
    }
}
