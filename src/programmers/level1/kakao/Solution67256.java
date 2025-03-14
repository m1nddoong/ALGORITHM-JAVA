package programmers.level1.kakao;

import java.util.HashMap;
import java.util.Map;

// [카카오 인턴] 키패드 누르기 : https://school.programmers.co.kr/learn/courses/30/lessons/67256
/*
    [1차 시도]
    : 기본적으로 map 을 활용해서 해당 값에 대한 위치값을 1차원 배열로 생각하여 풀이
        1(0)  2(1)  3(2)
        4(1)  5(2)  6(3)
        7(2)  8(3)  9(4)
        *(3)  0(4)  #(5)

    [답안]
    : 위치값을 2차원 배열에 넣고 map 으로 조회하는게 아닌 단순 2차원 배열
      키패드간 거리는 "맨해튼 거리" 공식 활용 -> (x좌표 차이 + y좌료 차이)
        1(0, 0)  2(0, 1)  3(0, 2)
        4(1, 0)  5(1, 1)  6(1, 2)
        7(2, 0)  8(2, 1)  9(2, 2)
        *(3, 0)  0(3, 1)  #(3, 2)
*/

public class Solution67256 {
    int[][] numpadPos = {
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };
    int[] leftPos = {3, 0};
    int[] rightPos = {3, 2};
    String hand;
    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";

        String answer = "";
        for (int num : numbers) {
            String Umji = pushNumber(num);
            answer += Umji;

            if (Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
            if (Umji.equals("R")) {rightPos = numpadPos[num]; continue;}

        }
        return answer;
    }

    private String pushNumber(int num) {
        if (num == 1 || num == 4 || num == 7) return "L";
        if (num == 3 || num == 6 || num == 9) return "R";
        if (getDist(leftPos, num) > getDist(rightPos, num)) return "R";
        if (getDist(leftPos, num) < getDist(rightPos, num)) return "L";
        return this.hand;
    }

    private int getDist(int[] pos, int num) {
        // 맨해튼 거리 적용
        return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
    }


    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        System.out.println(new Solution67256().solution(numbers1, hand1));
        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        System.out.println(new Solution67256().solution(numbers2, hand2));
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        System.out.println(new Solution67256().solution(numbers3, hand3));

    }
}