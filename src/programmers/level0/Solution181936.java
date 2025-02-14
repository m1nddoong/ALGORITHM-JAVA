package programmers.level0;

// 공배수 : https://school.programmers.co.kr/learn/courses/30/lessons/181936
public class Solution181936 {
    public static int solution(int number, int n, int m) {
        int answer = 0;
        if ((number % n == 0) && (number % m == 0)) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(solution(number, n, m));
    }
}
