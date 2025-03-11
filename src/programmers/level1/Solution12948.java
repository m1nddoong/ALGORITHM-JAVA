package programmers.level1;

import java.util.Arrays;

// 핸드폰 번호 가리기 : https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class Solution12948 {
    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        char[] chars = phone_number.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i >= chars.length - 4) {
                answer.append(chars[i]);
            } else {
                answer.append('*');
            }
        }
        return answer.toString();
        // return phone_number.replaceAll(".(?=.{4})", "*");
    }

    public static void main(String[] args) {
        String phone1 = "01033334444";
        String phone2 = "027778888";
        System.out.println(solution(phone1));
        System.out.println(solution(phone2));
    }
}
