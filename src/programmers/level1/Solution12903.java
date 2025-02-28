package programmers.level1;

// 가운데 글자 가져오기 : https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class Solution12903 {
    public static String solution(String s) {
        String answer = "";

        // 단어의 길이가 짝수
        if (s.length() % 2 == 0) {
            int mid = s.length() / 2 - 1;
            answer = s.substring(mid, mid + 2);
        }
        // 단어의 길이가 홀수
        else {
            int mid = s.length() / 2;
            answer = s.substring(mid, mid + 1);
        }

        return answer;
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "qwer";
        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }
}
