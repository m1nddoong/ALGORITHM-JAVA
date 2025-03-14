package programmers.level0;

import java.util.Arrays;

// [PCCE 기출문제] 5번 / 산책 : https://school.programmers.co.kr/learn/courses/30/lessons/250129
public class Solution250129 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

    public static void main(String[] args) {
        String route1 = "NSSNEWWN";
        String route2 = "EESEEWNWSNWWNS";
        System.out.println(Arrays.toString(new Solution250129().solution(route1)));
        System.out.println(Arrays.toString(new Solution250129().solution(route2)));
    }
}
