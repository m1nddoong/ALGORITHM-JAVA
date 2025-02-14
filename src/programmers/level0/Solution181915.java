package programmers.level0;

// 글자 이어 붙여 문자열 만들기 : https://school.programmers.co.kr/learn/courses/30/lessons/181915
public class Solution181915 {
    public static String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            int idx = index_list[i];
            answer.append(my_string.charAt(idx));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String my_string1 = "cvsgiorszzzmrpaqpe";
        int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String my_string2 = "zpiaz";
        int[] index_list2 = {1, 2, 0, 0, 3};
        System.out.println(solution(my_string1, index_list1));
        System.out.println(solution(my_string2, index_list2));
    }
}
