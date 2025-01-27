package programmers.basic;

// n보다 커질 떄까지 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class Solution181884 {
    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int num : numbers) {
            answer += num;
            if (answer > n) break;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers1 = {34, 5, 71, 29, 100, 34};
        int n1 = 123;
        System.out.println(solution(numbers1, n1));
        int[] numbers2 = {58, 44, 27, 10, 100};
        int n2 = 139;
        System.out.println(solution(numbers2, n2));
    }
}
