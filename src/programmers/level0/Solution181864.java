package programmers.level0;

// 문자열 바꿔서 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/181864
public class Solution181864 {
    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        // 소문자로 바꿔서 replace 하는 풀이
        // myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");

        return sb.toString().contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        String myString1 = "ABBAA";
        String pat1 = "AABB";
        System.out.println(solution(myString1, pat1));
        String myString2 = "ABAB";
        String pat2 = "ABAB";
        System.out.println(solution(myString2, pat2));
    }
}
