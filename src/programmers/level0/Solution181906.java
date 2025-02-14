package programmers.level0;

// 접두사인지 확인하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181906
public class Solution181906 {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(0, i).equals(is_prefix)) {
                answer = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix1 = "ban";
        String is_prefix2 = "nan";
        String is_prefix3 = "abcd";
        String is_prefix4 = "bananan";
        System.out.println(solution(my_string, is_prefix1));
        System.out.println(solution(my_string, is_prefix2));
        System.out.println(solution(my_string, is_prefix3));
        System.out.println(solution(my_string, is_prefix4));
    }
}

