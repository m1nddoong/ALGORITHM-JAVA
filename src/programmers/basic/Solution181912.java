package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열 만들기 5 : https://school.programmers.co.kr/learn/courses/30/lessons/181912
public class Solution181912 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (num > k) {
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }
}
