package programmers.level1;

// 정수 제곱근 판별 : https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Solution12934 {
    public static long solution(long n) {
        long answer = 0;
        // 제곱근 씌워보고 정수로 변환
        int num = (int) Math.sqrt(n);
        // 제곱했을 때 원래 값으로 복원가능한지
        if (n == Math.pow(num, 2)) {
            answer = (long) Math.pow(num+1, 2);
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 121; // 144
        int n2 = 3; // -1
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
