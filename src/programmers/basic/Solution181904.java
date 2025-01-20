package programmers.basic;

// 세로 읽기 : https://school.programmers.co.kr/learn/courses/30/lessons/181904
public class Solution181904 {
    public static String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        // ex1)
        // 전체 문자열 길이 20임
        // c = 2 니까 2부터 시작해서 4를 더하고 20보다 작을떄까지
        // m = 4) 2, 6, 10, 14, 18 인덱스의 글자를 이어붙인게 정답

        // ex2)
        // 전체 문자열 길이 11개
        // c = 1 이니까 1부터 시작해서 1씩 더하고 11보다 작거나 같을떄까지
        // m = 1) 1, 2, 3, 4, .... 11 까지

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }


        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string1 = "ihrhbakrfpndopljhygc";
        int m1 = 4;
        int c1 = 2;
        System.out.println(solution(my_string1, m1, c1));

        String my_string2 = "programmers";
        int m2 = 1;
        int c2 = 1;
        System.out.println(solution(my_string2, m2, c2));
    }
}
