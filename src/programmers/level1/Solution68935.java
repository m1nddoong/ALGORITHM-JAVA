package programmers.level1;

// 3진법 뒤집기 : https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class Solution68935 {
    public int solution(int n) {
        int answer = 0;
        // 3진법 : 11122
        String tenary = Integer.toString(n, 3);

        // 10진법으로 표기
        // 3진법 앞뒤 반전 : 22111 -> 1 + 3 + 9 + 54 + 162
        // 결국엔 뒤집지 않고 앞에서부터 3^0 곱으로 시작해서 10진수로 만들어주면 된다.
        String[] tenaryArr = tenary.split("");
        for (int i = 0; i < tenaryArr.length; i++) {
            // 3진법 자릿수
            int tenaryDigit = Integer.parseInt(tenaryArr[i]);
            // System.out.println(String.format("3^%d * %d = %d", i, tenaryDigit, (int) Math.pow(3, i) * tenaryDigit));
            answer += Math.pow(3, i) * tenaryDigit;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 45;
        System.out.println(new Solution68935().solution(n1));
        int n2 = 125;
        System.out.println(new Solution68935().solution(n2));
    }
}
