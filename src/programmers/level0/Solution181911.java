package programmers.level0;

// 부분 문자열 이어 붙여 문자열 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/181911
public class Solution181911 {
    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        System.out.println(solution(my_strings, parts));
    }
}
