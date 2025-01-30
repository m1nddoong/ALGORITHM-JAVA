package programmers.basic;

import java.util.ArrayList;
import java.util.List;

// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/181872
public class Solution181872 {
    public static String solution(String myString, String pat) {
        /* 나의 풀이 방법
        List<Integer> point = new ArrayList<>();

        // 1. myString, pat 모두 뒤에서부터 순회한다
        for (int i = myString.length() - 1; i >= 0; i--) {
            for (int j = pat.length() - 1; j >= 0; j--) {
                // 2. 순회 결과 pat 의 문자들이 각각 일치하는 것들의 인덱스를 point 리스트에 추가한다.
                if (myString.charAt(i) == pat.charAt(j)) {
                    point.add(i);
                    break;
                }
            }

        }
        // 3. pat 안에 추가된 인덱스 중 최대값을 반환
        int idx = point.stream()
                .reduce(Integer.MIN_VALUE, Math::max);

        // 4. 0 ~ 인덱스의 최댓값 까지의 문자열을 자른다.
        return myString.substring(0, idx + 1);
        */

        /* Solution */
        String answer = "";

        int idx = myString.lastIndexOf(pat);

        answer = myString.substring(0, idx) + pat;
        return answer;


    }

    public static void main(String[] args) {
        String myString1 = "AbCdEFG";
        String pat1 = "dE";
        System.out.println(solution(myString1, pat1));
        String myString2 = "AAAAaaaa";
        String pat2 = "a";
        System.out.println(solution(myString2, pat2));
    }
}

