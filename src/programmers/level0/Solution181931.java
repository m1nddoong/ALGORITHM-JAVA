package programmers.level0;

import java.util.stream.IntStream;

public class Solution181931 {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
//        int num;
//
//        for (int i = 0; i < included.length; i++) {
//            num = a + d * i;
//            if (included[i]) {
//                answer += num;
//            }
//        }
//
//        return answer;

        return IntStream.range(0, included.length)
                .map(i -> included[i] ? a + d * i : 0)
                .sum();

    }

    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(a, d, included));
    }
}
