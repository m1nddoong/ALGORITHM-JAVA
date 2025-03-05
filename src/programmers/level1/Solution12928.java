package programmers.level1;

// 약수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class Solution12928 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 5;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
