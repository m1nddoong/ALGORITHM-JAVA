package programmers.level1.kakao;

import java.util.Arrays;

// 2010 KAKAO BLIND RECURITMENT
// 실패율 : https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class Solution42889 {
    public static int[] solution(int N, int[] stages) {
        int[] result = new int[N];

        // 실패율 배열
        double[] failure = new double[N];

        // 각 스테이지 별 실패율 구하기
        for (int i = 0; i < N; i++) {
            // i = 1
            int numerator = 0;
            int denominator = 0;
            for (int j = 0; j < stages.length; j++) {
                // 2 보다 크거나 같은 스테이지 개수 : 7개
                if (i + 1 <= stages[j]) {
                    denominator++;
                }
                if (i + 1 == stages[j]) {
                    numerator++;
                }
            }
            if (denominator == 0) {
                failure[i] = 0;
            } else {
                failure[i] = (double) numerator / denominator;
            }
        }

        Integer[] stageOrder = new Integer[N];
        for (int i = 0; i < N; i++) {
            stageOrder[i] = i;
        }

        // 내림차순 정렬
        Arrays.sort(stageOrder, (a, b) -> {
            return Double.compare(failure[b], failure[a]);
        });

        for (int i = 0; i < N; i++) {
            result[i] = stageOrder[i] + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int N1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N1, stages1)));
        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(solution(N2, stages2)));
    }
}
