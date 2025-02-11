package programmers.basic;

// 커피 심부름 : https://school.programmers.co.kr/learn/courses/30/lessons/181837?language=java
public class Solution181837 {
    public static int solution(String[] order) {
        int answer = 0;

        for (String s : order) {
            if (s.contains("americano") || s.equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] order2 = {"americanoice", "americano", "iceamericano"};
        System.out.println(solution(order1));
        System.out.println(solution(order2));
    }
}
