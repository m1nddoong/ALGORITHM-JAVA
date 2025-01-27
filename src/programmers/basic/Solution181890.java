package programmers.basic;

import java.util.*;

// 왼쪽 오른쪽 : https://school.programmers.co.kr/learn/courses/30/lessons/181890
public class Solution181890 {
    public static String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            }
            else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return new String[]{};
    }

    public static void main(String[] args) {
        String[] str_list1 = {"u", "u", "l", "r"};
        System.out.println(Arrays.toString(solution(str_list1)));
        String[] str_list2 = {"l"};
        System.out.println(Arrays.toString(solution(str_list2)));

    }
}
