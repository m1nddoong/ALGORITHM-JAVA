package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 리스트 자르기 : https://school.programmers.co.kr/learn/courses/30/lessons/181897
public class Solution181897 {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        switch(n) {
            case 1:
                for (int i = 0; i <= slicer[1]; i++) {
                    answer.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++) {
                    answer.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    answer.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i = i + slicer[2]) {
                    answer.add(num_list[i]);
                }
                break;
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(solution(n1, slicer, num_list)));
        System.out.println(Arrays.toString(solution(n2, slicer, num_list)));
    }
}
