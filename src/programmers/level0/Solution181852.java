package programmers.level0;

import java.util.Arrays;

// 뒤에서 5등 위로 : https://school.programmers.co.kr/learn/courses/30/lessons/181852
public class Solution181852 {
    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
