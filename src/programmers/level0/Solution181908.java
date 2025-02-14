package programmers.level0;

// 접미사인지 확인하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181908
public class Solution181908 {
    public static int solution(String my_string, String is_suffix) {
        int answer = 0;

        // 접미사 집합 다 구하고 여기 속하는지 체크
        String[] arr = new String[my_string.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = my_string.substring(i);
            if (is_suffix.equals(arr[i])) answer = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix1 = "ana";
        String is_suffix2 = "nan";
        String is_suffix3 = "wxyz";
        String is_suffix4 = "abanana";
        System.out.println(solution(my_string, is_suffix1));
        System.out.println(solution(my_string, is_suffix2));
        System.out.println(solution(my_string, is_suffix3));
        System.out.println(solution(my_string, is_suffix4));
    }
}
