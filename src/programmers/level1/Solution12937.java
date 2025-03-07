package programmers.level1;

// 짝수와 홀수 : https://school.programmers.co.kr/learn/courses/30/lessons/12937
public class Solution12937 {
    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        System.out.println(solution(num1));
        System.out.println(solution(num2));
    }
}
