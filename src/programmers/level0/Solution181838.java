package programmers.level0;

import java.time.LocalDate;

// 날짜 비교하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181838
public class Solution181838 {
    public static int solution(int[] date1, int[] date2) {
        int answer = 0;

//        if (date1[0] < date2[0]) {
//            answer = 1;
//        } else if (date1[0] == date2[0]) {
//            if (date1[1] < date2[1]) {
//                answer = 1;
//            } else if (date1[1] == date2[1]) {
//                if (date1[2] < date2[2]) {
//                    answer = 1;
//                }
//            }
//        }

        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);

        if (dateA.isBefore(dateB)) {
            answer = 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] dateA1 = {2021, 12, 28};
        int[] dateA2 = {2021, 12, 29};
        System.out.println(solution(dateA1, dateA2));
        int[] dateB1 = {1024, 10, 24};
        int[] dateB2 = {1024, 10, 24};
        System.out.println(solution(dateB1, dateB2));
    }
}
