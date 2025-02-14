package programmers.level0;

public class Solution181935 {
    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += (int) Math.pow(i, 2);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
