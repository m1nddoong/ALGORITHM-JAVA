package programmers.알고리즘_고득점_Kit.N05_완전탐색;

// 최소직사각형 : https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Solution86491 {
    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxW, maxH;
        int minWalletSize = 0;
        for (int i = 1; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution(sizes1));
        System.out.println(solution(sizes2));
        System.out.println(solution(sizes3));

    }
}
