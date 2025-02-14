package programmers.level0;

import java.math.BigInteger;

// 두 수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/181846
public class Solution181846 {
    public static String solution(String a, String b) {
        return String.valueOf((new BigInteger(a).add(new BigInteger(b))));
    }
    public static void main(String[] args) {
        String a1 = "582";
        String b1 = "734";
        System.out.println(solution(a1, b1));
        String a2 = "18446744073709551615";
        String b2 = "287346502836570928366";
        System.out.println(solution(a2, b2));
        String a3 = "0";
        String b3 = "0";
        System.out.println(solution(a3, b3));
    }
}
