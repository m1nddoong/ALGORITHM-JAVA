package programmers.basic;

// 9로 나눈 나머지 : https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Solution181914 {
    public static int solution(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum % 9;

        // return number.chars().map(c -> (c - '0') % 9).sum() % 9;
        // 아스키 코드 값 뺴주고 나눠주기
    }

    public static void main(String[] args) {
        String number1 = "123";
        System.out.println(solution(number1));
        String number2 = "78720646226947352489";
        System.out.println(solution(number2));

    }
}
