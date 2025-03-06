package programmers.level1;

// 자릿수 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class Solution12931 {
    public static int solution(int n) {
        int answer = 0;

        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.split("")[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 987;
        System.out.println(solution(n1));
        System.out.println(solution(n2));

    }
}
