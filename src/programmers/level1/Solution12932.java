package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 자연수 뒤집어 배열로 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class Solution12932 {
    public static int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();

        String s = String.valueOf(n);
        for (int i = s.length() - 1; i >= 0; i--) {
            answer.add(Integer.parseInt(s.split("")[i]));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
