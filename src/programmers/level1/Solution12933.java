package programmers.level1;

import java.util.Arrays;

// 정수 내림차순으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class Solution12933 {
    public static long solution(long n) {
        String s = String.valueOf(n);
        String[] arr = s.split("");

        // 내림차순 정렬하기
        Arrays.sort(arr, (a, b) -> {
            return b.compareTo(a);
        });


        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }

        return Long.parseLong(sb.toString());

        // Arrays.sort(arr) 이후 sb 에 넣고 sb.reverse() 를 해서 뒤집을 수도 있음.
    }

    public static void main(String[] args) {
        int n = 118372;
        System.out.println(solution(n));
    }
}
