package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 문자열 내림차순으로 배치하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Solution12917 {
    public static String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(String.valueOf(arr[i]));
        }

        return sb.toString();


        /*
        * List<String> arr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            arr.add(String.valueOf(c));
        }
        Collections.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }

        return sb.toString();
        * */
    }
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
