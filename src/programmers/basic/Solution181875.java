package programmers.basic;

import java.util.Arrays;

// 배열에서 문자열 대소문자 변환하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181875
public class Solution181875 {
    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            }
            else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strArr1 = {"AAA", "BBB", "CCC", "DDD"};
        String[] strArr2 = {"aBc", "AbC"};
        System.out.println(Arrays.toString(solution(strArr1)));
        System.out.println(Arrays.toString(solution(strArr2)));
    }
}
