package programmers.알고리즘_고득점_Kit.N04_정렬;

import java.util.Arrays;

// K번째 수 : https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Solution42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++) {
            int i = commands[l][0];
            int j = commands[l][1];
            int k = commands[l][2];
            int[] temp = Arrays.copyOfRange(array, i - 1, j);
            // System.out.println("자른 배열 : " + Arrays.toString(temp));
            Arrays.sort(temp);
            // System.out.println("정렬 후: " + Arrays.toString(temp));
            answer[l] = temp[k - 1];
            // System.out.println("k 번쨰 수: " + answer[l]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
}
