package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;

// 배열 만들기 2 : https://school.programmers.co.kr/learn/courses/30/lessons/181921
public class Solution181921 {
    public static int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            // Integer.toBinaryString(i) 로 i 를 2진수 문자열로 변환
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        System.out.println(Arrays.toString(solution(l, r)));
    }
}
