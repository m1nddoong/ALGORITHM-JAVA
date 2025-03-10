package programmers.level1;

import java.util.Arrays;

// 평균 구하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Solution12944 {
    public static double solution(int[] arr) {
//        double answer = 0;
//        for (int num : arr) {
//            answer += num;
//        }
//        return answer / arr.length;
        return (int) Arrays.stream(arr).average().getAsDouble();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 5};
        System.out.println(solution(arr1));
        System.out.println(solution(arr2));

    }
}
