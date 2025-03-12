package programmers.알고리즘_고득점_Kit.N05_완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// 모의고사 : https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class Solution42840 {
    public static int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hitCount = new int[3];
        for (int i = 0; i < hitCount.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if ((patterns[i][j % patterns[i].length]) == answers[i]) {
                    hitCount[i]++;
                }
            }
        }
        int max = Math.max(hitCount[0], Math.max(hitCount[1], hitCount[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < hitCount.length; i++) {
            if (max == hitCount[i]) list.add(i+1);
        }
        return list.stream().mapToInt(i -> i).toArray();

//        int[] person1 = new int[answers.length];
//        int[] person2 = new int[answers.length];
//        int[] person3 = new int[answers.length];
//
//        // 수포자1
//        for (int i = 0; i < person1.length; i += 5) {
//            for (int j = 0; j < 5; j++) {
//                if (i + j < person1.length) {
//                    person1[i + j] = j + 1;
//                }
//            }
//        }
//
//        // 수포자2
//        for (int i = 0; i < person2.length; i++) {
//            if (i % 2 == 0) {
//                person2[i] = 2;
//            }
//            else {
//                if (i % 8 == 1) {
//                    person2[i] = 1;
//                } else if (i % 8 == 3) {
//                    person2[i] = 3;
//                } else if (i % 8 == 5) {
//                    person2[i] = 4;
//                } else if (i % 8 == 7) {
//                    person2[i] = 5;
//                }
//            }
//        }
//
//        // 수포자 3
//        for (int i = 0; i < person3.length; i++) {
//            if (i % 10 == 1 || i % 10 == 0) {
//                person3[i] = 3;
//            }
//            else if (i % 10 == 2 || i % 10 == 3) {
//                person3[i] = 1;
//            }
//            else if (i % 10 == 4 || i % 10 == 5) {
//                person3[i] = 2;
//            }
//            else if (i % 10 == 6 || i % 10 == 7) {
//                person3[i] = 4;
//            }
//            else if (i % 10 == 8 || i % 10 == 9) {
//                person3[i] = 5;
//            }
//        }
//
//        int[] count = new int[3];
//        for (int i = 0; i < answers.length; i++) {
//            if (person1[i] == answers[i]) {
//                count[0]++;
//            }
//            if (person2[i] == answers[i]) {
//                count[1]++;
//            }
//            if (person3[i] == answers[i]) {
//                count[2]++;
//            }
//        }
//
//        // 최댓값 찾기
//        OptionalInt max = Arrays.stream(count).max();
//        if (max.isPresent()) {
//            List<Integer> answer = new ArrayList<>();
//            for (int i = 0; i < 3; i++) {
//                if (count[i] == max.getAsInt()) {
//                    answer.add(i+1);
//                }
//            }
//            return answer.stream().mapToInt(i -> i).toArray();
//        } else {
//            return new int[0];
//        }

    }



    public static void main(String[] args) {
        int[] answer1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(solution(answer1)));
        int[] answer2 = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answer2)));
    }
}
