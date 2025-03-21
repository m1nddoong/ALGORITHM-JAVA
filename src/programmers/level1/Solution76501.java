package programmers.level1;

// 음양 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class Solution76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                answer += absolutes[i] - 2 * absolutes[i];

            } else {
                answer += absolutes[i];
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] absolutes1 = {4, 7, 12};
        boolean[] sign1 = {true, false, true};
        System.out.println(new Solution76501().solution(absolutes1, sign1));

        int[] absolutes2 = {1, 2, 3};
        boolean[] sign2 = {false, false, true};
        System.out.println(new Solution76501().solution(absolutes2, sign2));
    }
}
