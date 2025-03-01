package programmers.level1;

// 두 정수 사이의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/12912
public class Solution12912 {
    public static long solution(int a, int b) {
        long answer = 0;
        int maxNum = a > b ? a : b;
        int minNum = a < b ? a : b;

        if (maxNum == minNum) {
            return maxNum;
        }
        else {
            for (int i = minNum; i <= maxNum; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int a1 = 3;
        int a2 = 3;
        int a3 = 5;
        int b1 = 5;
        int b2 = 3;
        int b3 = 3;
        System.out.println(solution(a1, b1));
        System.out.println(solution(a2, b2));
        System.out.println(solution(a3, b3));
    }
}
