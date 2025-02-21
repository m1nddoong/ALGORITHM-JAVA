package programmers.알고리즘_고득점_Kit.N01_해시;

import java.util.*;

// 전화번호 목록 : https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Solution42577 {
    public static boolean solution(String[] phone_book) {
        /*
        해시 풀이 X
         */
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            String s = phone_book[i];
            if (phone_book[i + 1].startsWith(s)) {
                return false;
            }
        }
         return true;

        /* 이전 풀이
        for (String a : phone_book) {
            for (String b : phone_book) {
                if (!a.equals(b) && b.startsWith(a)) {
                    return false;
                }
            }
        }
        return true;
        */
    }

    public static void main(String[] args) {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book1));
        System.out.println(solution(phone_book2));
        System.out.println(solution(phone_book3));

    }
}


