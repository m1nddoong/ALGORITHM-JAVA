package programmers.level1;

import java.util.Arrays;
import java.util.StringTokenizer;

// 이상한 문자 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Solution12930 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("");

        int idx = 0;
        for (int i = 0; i < words.length; i++) {
            // 공백
            if (words[i].equals(" ")) {
                sb.append(words[i]);
                idx = 0;
            }
            // 공백이 아닌 단어일때
            else {
                if (idx % 2 == 0) {
                    sb.append(words[i].toUpperCase());
                    idx++;
                } else {
                    sb.append(words[i].toLowerCase());
                    idx++;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "try  hello  world";
        System.out.println(solution(s1));
        String s2 = " read the explanation carefully  ";
        System.out.println(solution(s2));
        // 기댓값 : " ReAd ThE ExPlAnAtIoN CaReFuLlY  "
    }
}
