package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution12926 {
    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // 대문자 (A ~ Z : 65 ~ 90)
            if (65 <= (int) arr[i] && (int) arr[i] <= 90) {
                arr[i] = (char) ((int) arr[i] + n);
                if (arr[i] > 90) {
                    arr[i] = (char) ((int) arr[i] - 26);
                }
            }
            // 소문자 (a ~ z : 97 ~ 122)
            else if (97 <= (int) arr[i] && (int) arr[i] <= 122) {
                arr[i] = (char) ((int) arr[i] + n);
                if (arr[i] > 122) {
                    arr[i] = (char) ((int) arr[i] - 26);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "AB";
        int n1 = 1;
        System.out.println(solution(s1, n1));
        String s2 = "z";
        int n2 = 1;
        System.out.println(solution(s2, n2));
        String s3 = "a B z";
        int n3 = 4;
        System.out.println(solution(s3, n3));
    }
}
