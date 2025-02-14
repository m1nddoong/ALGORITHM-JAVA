package programmers.level0;

import java.util.*;

// 전국 대회 선발 고사 : https://school.programmers.co.kr/learn/courses/30/lessons/181851
public class Solution181851 {
    public static int solution(int[] rank, boolean[] attendance) {
//        // 등수 - 학생 번호
//        Map<Integer, Integer> student = new HashMap<>();
//        for (int i = 0; i < rank.length; i++) {
//            if (attendance[i]) {
//                student.put(rank[i], i);
//            }
//        }
//        // 상위 1, 2, 3등
//        List<Integer> top = new ArrayList<>();
//        for (Integer key : student.keySet()) {
//            System.out.println("등수 : " + key + ", 학생 번호 : " + student.get(key));
//            if (top.size() == 3) break;
//            top.add(student.get(key));
//        }
//
//        return 10000 * top.get(0) + 100 * top.get(1) + top.get(2);
        {
            // TreeMap을 사용하여 자동 정렬 (등수를 key, 학생 번호를 value)
            Map<Integer, Integer> student = new TreeMap<>();
            for (int i = 0; i < rank.length; i++) {
                if (attendance[i]) {
                    student.put(rank[i], i);
                }
            }

            // 상위 3명의 학생 번호 가져오기
            Iterator<Integer> iterator = student.values().iterator();
            int a = iterator.next();
            int b = iterator.next();
            int c = iterator.next();

            return 10000 * a + 100 * b + c;
        }
    }

    public static void main(String[] args) {
        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance1 = {false, true, true, true, true, false, false};
        System.out.println(solution(rank1, attendance1));

        int[] rank2 = {1, 2, 3};
        boolean[] attendance2 = {true, true, true};
        System.out.println(solution(rank2, attendance2));

        int[] rank3 = {6, 1, 5, 2, 3, 4};
        boolean[] attendance3 = {true, false, true, false, false, true};
        System.out.println(solution(rank3, attendance3));
    }
}
