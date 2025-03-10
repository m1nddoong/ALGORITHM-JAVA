package programmers.level1;

// 콜라츠 추측 : https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class Solution12943 {
    public static int solution(int num) {
        int answer = 0;
        long n = num;

        // 2. 결과로 나온 수에 같은 작업을 1이 될떄까지 반복한다.
        while (n > 1) {
            // 1-1. 입력된 수가 짝수라면 2로 나눈다.
            if (n % 2 == 0) {
                n /= 2;
                answer++;
            }
            // 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
            else {
                n = 3 * n + 1;
                answer++;
            }
        }

        return answer >= 500 ? -1 : answer;
    }

    public static void main(String[] args) {
        //int n1 = 6;
        //int n2 = 16;
        int n3 = 626331;
        //System.out.println(solution(n1));
        //System.out.println(solution(n2));
        System.out.println(solution(n3));
    }
}
