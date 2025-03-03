package programmers.level1;

// 수박수박수박수박수박수? : https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Solution12922 {
    public static String solution(int n) {
        String answer = "";
        char evenWord = '수';
        char oddWord = '박';

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += evenWord;
            } else {
                answer += oddWord;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
