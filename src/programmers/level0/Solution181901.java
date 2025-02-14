package programmers.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

// 배열 만들기 1 : https://school.programmers.co.kr/learn/courses/30/lessons/181901
public class Solution181901 {
    public static int[] solution(int n, int k) {
//        List<Integer> answer = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i % k == 0) {
//                answer.add(i);
//            }
//        }
//        return answer.stream().mapToInt(i -> i).toArray();
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % k == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int n1 = 10;
        int k1 = 3;
        System.out.println(Arrays.toString(solution(n1, k1)));
        int n2 = 15;
        int k2 = 5;
        System.out.println(Arrays.toString(solution(n2, k2)));
    }
}
