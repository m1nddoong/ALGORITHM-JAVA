package programmers.level0;

import java.util.*;

// 문자열 잘라서 정렬하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181866
public class Solution181866 {
    public static String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(myString, "x");
        while (st.hasMoreTokens()) {
            answer.add(st.nextToken());
        }
        Collections.sort(answer);
        return answer.toArray(String[]::new);

        // Stream 풀이
//        return Arrays.stream(myString.split("x"))
//                .filter(s -> !s.isEmpty())
//                .sorted()
//                .toArray(String[]::new);


    }

    public static void main(String[] args) {
        String myString1 = "axbxcxdx";
        String myString2 = "dxccxbbbxaaaa";
        System.out.println(Arrays.toString(solution(myString1)));
        System.out.println(Arrays.toString(solution(myString2)));
    }
}
