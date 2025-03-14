package programmers.level1;

// 3진법 뒤집기 :
public class Solution68935 {
    public int solution(int n) {
        int answer = 0;


        // 3진법이라는건 0 1 2 로 수를 표현하는건가?

        // 45 라는 수를 3진법으로 나타내면

        // 3의 3제곱 (27) + 3의 2제곱 2번 (18) + 3의 1제곱 0번  + 3의 0제곱 0번

        int divisor = n / 3;
        int remain = n % 3;



        return answer;
    }

    public static void main(String[] args) {
        int n1 = 45;
        System.out.println(new Solution68935().solution(n1));
        int n2 = 125;
        System.out.println(new Solution68935().solution(n2));
    }
}
