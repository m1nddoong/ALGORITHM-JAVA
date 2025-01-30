package programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ad 제거하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181870
public class Solution181870 {
    public static String[] solution(String[] strArr) {
//        List<String> arr = new ArrayList<>();
//
//        for (String str : strArr) {
//            if (!str.contains("ad")) {
//                arr.add(str);
//            }
//        }
//
//        return arr.toArray(new String[0]);

        // 스트림 버전 풀이
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] strArr1 = {"and","notad","abcd"};
        System.out.println(Arrays.toString(solution(strArr1)));
        String[] strArr2 = {"there","are","no","a","ds"};
        System.out.println(Arrays.toString(solution(strArr2)));
    }
}
