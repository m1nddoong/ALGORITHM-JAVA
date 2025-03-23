package programmers.level1;

// 신규 아이디 추천 : https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class Solution72410 {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase()
                .replaceAll("[^0-9|a-z|.|_|-]", "")
                .replaceAll("\\.{2,}", ".")
                .replaceAll("^\\.|\\.$", "");

        if (answer.isEmpty()) {
            answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15).replaceAll("\\.$", "");
        }

        if (answer.length() < 3) {
            char lastChar = answer.charAt(answer.length() - 1);
            answer += String.valueOf(lastChar).repeat(3 - answer.length());
        }

        return answer;
    }

    public static void main(String[] args) {
        String newId1 = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(new Solution72410().solution(newId1));
        String newId2 = "z-+.^.";
        System.out.println(new Solution72410().solution(newId2));
        String newId3 = "=.=";
        System.out.println(new Solution72410().solution(newId3));
        String newId4 = "123_.def";
        System.out.println(new Solution72410().solution(newId4));
        String newId5 = "abcdefghijklmn.p";
        System.out.println(new Solution72410().solution(newId5));
    }

}
