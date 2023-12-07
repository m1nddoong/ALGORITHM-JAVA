package programmers;

// 더 크게 합치기
// https://school.programmers.co.kr/learn/courses/30/lessons/181939

public class Solution181939 {
    public static int solution(int a, int b) {
        // 양의 정수 a, b를 문자 a, b로 만들기?
        // String ab = Integer.toString(a) + Integer.toString(b);
        // String ba = Integer.toString(b) + Integer.toString(a);
        // int answer = 0;

        String resultA = "" + a + b;
        // String resultA = String.format("%d%d", a, b);
        // StringBuilder aBuilder = new StringBuilder();
        // aBuilder.append(a).append(b);
        String resultB = "" + b + a;

        int resultAInt = Integer.parseInt(resultA);
        int resultBInt = Integer.parseInt(resultB);

        //if (Integer.parseInt(ab) < Integer.parseInt(ba)) {
        //    answer = Integer.parseInt(ba);
        //} else {
        //    answer = Integer.parseInt(ab);
        //}
        //return answer;

        /*if (resultAInt > resultBInt) {
            return resultAInt;
        }
        else {
            return resultBInt;
        }*/

        return Math.max(resultAInt, resultBInt);
    }

    public static void main(String[] args) {
        // System.out.println(solution(9, 91));
        // System.out.println(solution(89, 8));

        new Solution181939().solution(12, 3);

    }
}
