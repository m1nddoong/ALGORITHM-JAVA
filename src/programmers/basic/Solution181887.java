package programmers.basic;

// 홀수 vs 짝수 : https://school.programmers.co.kr/learn/courses/30/lessons/181887
public class Solution181887 {
    public static int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < num_list.length; i++) {
            if ((i+1) % 2 == 0) {
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }

        return Math.max(evenSum, oddSum);
    }

    public static void main(String[] args) {
        int[] num_list1 = {4, 2, 6, 1, 7, 6};
        System.out.println(solution(num_list1));
        int[] num_list2 = {-1, 2, 5, 6, 3};
        System.out.println(solution(num_list2));
    }
}
