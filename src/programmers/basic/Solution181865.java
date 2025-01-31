package programmers.basic;

// 간단한 식 계산하기 : https://school.programmers.co.kr/learn/courses/30/lessons/181865
public class Solution181865 {
    public static int solution(String binomial) {
        int answer = 0;
        String[] op = binomial.split(" ");
        switch (op[1]) {
            case "+" :
                answer = Integer.parseInt(op[0]) + Integer.parseInt(op[2]);
                break;
            case "-" :
                answer = Integer.parseInt(op[0]) - Integer.parseInt(op[2]);
                break;
            default:
                answer = Integer.parseInt(op[0]) * Integer.parseInt(op[2]);
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        String binomial1 = "43 + 12";
        String binomial2 = "0 - 7777";
        String binomial3 = "40000 * 40000";
        System.out.println(solution(binomial1));
        System.out.println(solution(binomial2));
        System.out.println(solution(binomial3));

    }
}
