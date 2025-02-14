package programmers.level0;

// 문자열 정수의 합 : https://school.programmers.co.kr/learn/courses/30/lessons/181849
public class Solution181849 {
    public static int solution(String num_str) {
//        int answer = 0;
//        for (String s : num_str.split("")) {
//            answer += Integer.parseInt(s);
//        }
//        return answer;
        return num_str.chars().map(c -> c - 48).sum();
    }

    public static void main(String[] args) {
        String num_str1 = "123456789";
        String num_str2 = "1000000";
        System.out.println(solution(num_str1));
        System.out.println(solution(num_str2));
    }
}
