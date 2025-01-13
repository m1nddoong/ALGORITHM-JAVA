package programmers.basic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution181841 {
    public static String solution(String[] str_list, String ex) {
//        String answer = "";
//
//        for (String str : str_list) {
//            if (!str.contains(ex)) {
//                answer = answer + str;
//            }
//        }
//
//        return answer;
        return Arrays.stream(str_list)
                .filter(s -> !s.contains(ex))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String[] str_list1 = {"abc", "def", "ghi"};
        String ex1 = "ef";
        System.out.println(solution(str_list1, ex1));
        String[] str_list2 = {"abc", "bbc", "cbc"};
        String ex2 = "c";
        System.out.println(solution(str_list2, ex2));
    }
}
