package programmers.level0;

import java.util.Arrays;

// 공백으로 구분하기 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181869
public class Solution181869 {
    public static String[] solution(String my_string) {
        // StringTokenizer 풀이
//        List<String> answer = new ArrayList<>();
//
//        StringTokenizer st = new StringTokenizer(my_string);
//        while (st.hasMoreTokens()) {
//            answer.add(st.nextToken());
//        }
//
//        return answer.toArray(String[]::new);

        // split() 풀이
        String[] answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        String my_string1 = "i love you";
        System.out.println(Arrays.toString(solution(my_string1)));
        String my_string2 = "programmers";
        System.out.println(Arrays.toString(solution(my_string2)));

    }
}
