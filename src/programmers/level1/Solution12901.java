package programmers.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

// 2016년 : https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class Solution12901 {
    public static String solution(int a, int b) {
        // 1. 배열을 이용한 구현
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = b; // 해당 월의 총 날짜 수
        for (int i = 0; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        return daysOfWeek[(totalDays - 1) % 7];

        /* 2. LocalDate 를 사용한 방법
        // 2016년 a월 b일의 LocalDate 객체 생성
        LocalDate date = LocalDate.of(2016, a, b);
        // 해당 날짜의 요일 가져오기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // 요일을 SUN ~ SAT 형식으로 변환
        String[] daysOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // DayOfWeek의 ordinal() 메서드는 0부터 시작하는 인덱스를 반환
        return daysOfWeek[dayOfWeek.getValue() % 7];
        */
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
    }
}
